package java01;

public class TestOne {
	/*
	 * 4.新建一个TestOne类，在main方法中定义两个boolean 类型的变量flag 赋值为true和mark 赋值为false，
	 * 将他们的“&&”和“||”的逻辑运算结果依次赋值给新的变量result，并打印输出这两个结果。
	 */
	public static void main(String[] args) {
		boolean flag = true;
		boolean mark = false;
		boolean result;
		result = flag && mark;
		System.out.println(result);
		result = flag || mark;
		System.out.println(result);

	}
}
