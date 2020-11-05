package liu;

public class TriangleTwo {
	public static void main(String[] args) {
		char num;
		//写个行，在行的限制条件下写列  随着行数加1而加1  然后输出       
		for (int i = 0; i < 5; i++) {
			//在i为偶数字符为z，其他情况为o
			if (i %2==0) {
				num = 'z';
			} else {
				num = 'o';
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
