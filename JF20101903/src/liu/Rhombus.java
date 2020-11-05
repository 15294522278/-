package liu;

public class Rhombus {
	public static void main(String[] args) {
//先写出5行
		for (int i = 1; i <= 5; i++) {
			// 写出每行的空格，随着行数i的变化而变化，初始值为5-i
			for (int j = 5 - i; j >= 1; j--) {
				System.out.print(" ");
			}
			// 写出每行的空格，随着行数i的变化而变化，循环条件为k与i的关系为2*i-1
			for (int k = 1; k <= 2 * i - 1; k++) {
//空一格用continue完成
				if (k % 2 == 0) {
					System.out.print(" ");
					continue;
				}
				System.out.print("o");
			}
			System.out.println();
		}
		// 下半部分,先写行
		for (int i = 1; i <= 4; i++) {
			// 写每行的空格
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			// 每一行 里执行的循环
			for (int k = 8 - 2 * i + 1; k >= 1; k--) {

				if (k % 2 == 0) {
					System.out.print(" ");
					continue;
				}
				System.out.print("o");
			}
			System.out.println();
		}
	}
}
