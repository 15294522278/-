package liu;

public class IsoscelseTwo {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			char num;
			if (i % 2 == 1) {
				num = 'o';
			} else {
				num = 'z';
			}

			for (int j = 5 - i; j >= 1; j--) {

				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {

				if (k % 2 == 0) {
					System.out.print(" ");
					continue;
				}
				System.out.print(num);
			}
			System.out.println();
		}
	}
}