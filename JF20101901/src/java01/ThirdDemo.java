package java01;

public class ThirdDemo {
	public static void main(String[] args) {
		/*
		 * 3.创建一个ThirdDemo类，写一个main方法， 定义两个float类型的变量fa赋值为0.1和fb赋值为0.5，
		 * 分别将他们的‘加/减/乘/除的结果赋值给一个新的变量res ,并打印输出每一个结果。
		 */
		float fa = 0.1F;
		float fb = 0.5F;
		float res;
		res = fa + fb;
		System.out.println(res);
		res = fa - fb;
		System.out.println(res);
		res = fa * fb;
		System.out.println(res);
		res = fa / fb;
		System.out.println(res);
		res = fa % fb;
		System.out.println(res);
	}
}
