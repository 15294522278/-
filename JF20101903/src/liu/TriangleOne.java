package liu;

public class TriangleOne {
	public static void main(String[] args) {
		//写个行，在行的限制条件下写列  随着行数加1而加1  然后输出
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("o ");
			}
			System.out.println();
		}
	}
}
