package liu;

import java.util.Random;
import java.util.Scanner;

public class FingerGuessingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==欢迎来到猜拳游戏==");
		System.out.println("请出拳：1-石头 2-剪刀 3-布");
		int num2 = sc.nextInt();
		Random ran = new Random();
		int num = ran.nextInt(3) + 1;
		// 输入的数的分支 玩家出石头
		if (num2 == 1) {
			System.out.println("玩家出石头");
			// 电脑出石头
			if (num == 1) {
				System.out.println("电脑出石头");
				System.out.println("平局！");
			}
			// 电脑出剪刀
			else if (num == 2) {
				System.out.println("电脑出剪刀");
				System.out.println("运气不错，你赢了！");
			}
			// 电脑出布
			else if (num == 3) {
				System.out.println("电脑出布");
				System.out.println("运气不太行，电脑赢了！");
			}
		}
		// 输入的数的分支2 玩家出剪刀
		else if (num2 == 2) {
			System.out.println("玩家出剪刀");
			if (num == 1) {
				// 电脑出石头
				System.out.println("电脑出石头");
				System.out.println("运气不太行，电脑赢了！");
			} else if (num == 2) {
				// 电脑出剪刀
				System.out.println("电脑出剪刀");
				System.out.println("平局！");
			} else if (num == 3) {
				// 电脑出布
				System.out.println("电脑出布");
				System.out.println("运气不错，你赢了！");
			}
			// 输入的数的分支3 玩家出布
		} else if (num2 == 3) {
			System.out.println("玩家出布");
			if (num == 1) {
				// 电脑出石头
				System.out.println("电脑出石头");
				System.out.println("运气不错，你赢了！");
			} else if (num == 2) {
				// 电脑出剪刀
				System.out.println("电脑出剪刀");
				System.out.println("运气不太行，电脑赢了！");
			} else if (num == 3) {
				// 电脑出布
				System.out.println("电脑出布");
				System.out.println("平局！");
			} else {
				System.out.println("出拳有误！");
			}
		} else {
			System.out.println("出拳有误！");
		}
	}
}
