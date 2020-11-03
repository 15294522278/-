package java01;

public class TestSwap {
	public static void main(String[] args) {
		/*
		 * 7.新建一个TestSwap类，在main方法中任意定义两个int类型的变量a=13和b=7， 交换a和b的值，并打印交换后的结果（两种方法）
		 */
		// 方法1
		int a = 13;
		int b = 7;
		int res = a;
		a = b;
		b = res;
		System.out.println("a=" + a + "b=" + b);
		// 方法2
		a = 13;
		b = 7;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a=" + a + "b=" + b);

	}
}
