package liu;

import java.util.Scanner;

public class TicketOrder {
	public static void main(String[] args) {
		System.out.println("==机票订购系统==");
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择要出行的月份");
		int num = sc.nextInt();
		System.out.println("请输入要预订的舱位：1-头等舱  2-经济舱");
		int num2 = sc.nextInt();
		// 同时满足两个输入条件的分支
		if ((num == 5 || num == 6 || num == 7 || num == 9 || num == 10 || num == 11) && num2 == 1) {
			System.out.println("机票预订成功！本次金额：900.0元");
		} else if ((num == 5 || num == 6 || num == 7 || num == 9 || num == 10 || num == 11) && num2 == 2) {
			System.out.println("机票预订成功！本次金额：800.0元");
		} else if ((num == 1 || num == 2 || num == 3 || num == 4 || num == 8 || num == 12) && num2 == 1) {
			System.out.println("机票预订成功！本次金额：700.0元");
		} else if ((num == 1 || num == 2 || num == 3 || num == 4 || num == 8 || num == 12) && num2 == 2) {
			System.out.println("机票预订成功！本次金额：600.0元");
		} else {
			System.out.println("选项有误，再见");
		}

	}
}
