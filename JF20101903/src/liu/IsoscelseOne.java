package liu;

public class IsoscelseOne {
	public static void main(String[] args) {
		//写个行，
		for (int i = 1; i <= 5; i++) {
				//写每行应该有多少空格
			for (int j = 5 - i; j >= 1; j--) {
				System.out.print(" ");
			}
			//写每行的字符数  是一个等差数列，写出所有情况  他们的关系为2 * i - 1 在为k偶数时用continue中断循环写空格
			for (int k = 1; k <= 2 * i - 1; k++) {

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
