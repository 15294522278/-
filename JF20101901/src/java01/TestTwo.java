package java01;

public class TestTwo {
	public static void main(String[] args) {
		/*
		 * 5.继续新建一个TestTwo类，在main方法中定义三个double类型的变量 x y z，任意赋值， 输出(x+y)的和 与 z
		 * 的关系是“大于>”时的结果，“小于<”时的结果，“等于==”时的结果， 将三次结果依次都赋值给一个变量res，并打印输出这每一个结果。
		 */
		double x = 1;
		double y = 2;
		double z = 3;
		boolean res = true;
		System.out.println(x + y > z ? res : !res);
		System.out.println(x + y < z ? res : !res);
		System.out.println(x + y == z ? res : !res);

	}
}
