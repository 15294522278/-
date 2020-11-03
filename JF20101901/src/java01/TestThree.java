package java01;

public class TestThree {
	public static void main(String[] args) {
		/*
		 * 6.新建一个TestThree类，在main方法中定义三个 int类型变量 x， y， z，任意赋值，
		 * 求出三个数中最大的那个数是多少，打印输出。（用三元运算符）。
		 */
		int x = 1;
		int y = 2;
		int z = 3;
		int max;
		max = x > y ? x : y;
		max = max > z ? max : z;
		System.out.println("最大值位：" + max);
	}
}
