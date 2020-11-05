package liu;

public class MultiplicationTable {
	public static void main(String[] args) {

		int num;
		//写个行，在行的限制条件下写列  随着行数加1而加1  然后输出
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				num = j * i;
				System.out.print(j + " x " + i + " = " + num + " ");
			}
			System.out.println("");
		}
	}
}
