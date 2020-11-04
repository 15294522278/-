package liu;

import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入消费金额");
		int num = sc.nextInt();
		if (num >= 100) {
			System.out.println("选项一: +1元换购鼠标");
			System.out.println("选项二: +5元换购键盘");
			System.out.println("选项三: +10元换购充电宝");
			System.out.println("选项四: +20元换购移动硬盘");
			int num2 = sc.nextInt();
			//在输入大于100的情况下的分支
			switch (num2) {
			case 1:
				System.out.println("换购鼠标成功！最终消费：" + (num + 1) + "元");
				break;
			case 2:
				System.out.println("换购键盘成功！最终消费：" + (num + 5) + "元");
				break;
			case 3:
				System.out.println("换购充电宝成功！最终消费：" + (num + 10) + "元");
				break;
			case 4:
				System.out.println("换购移动硬盘成功！最终消费：" + (num + 20) + "元");
				break;
			default:
				System.out.println("选项有误，取消换购资格，本次消费：" + num + "元");
			}
		} else if (num < 100 && num > 0) {
			System.out.println("消费不足，无法换购吧，本次消费金额：" + num + "元");
		} else {
			System.out.println("输入金额错误");
		}

	}

}
