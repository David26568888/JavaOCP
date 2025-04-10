package day05;

public class HanoiTower {

	private static int moveCount = 0; // 計數器

	public static void main(String[] args) {
		int numDisks = 5; // 盤子的數量
		moveDisks(numDisks, 'A', 'C', 'B'); // A: 起始柱子, C: 目標柱子, B: 輔助柱子
		System.out.println("總移動次數: " + moveCount);
	}

	// 移動盤子的遞迴方法
	private static void moveDisks(int n, char source, char target, char auxiliary) {
		if (n == 1) {
			moveCount++;
			System.out.println("移動盤子 " + n + " 從 " + source + " 到 " + target);
			return;
		}
		// 將 n-1 個盤子從源柱子移到輔助柱子
		moveDisks(n - 1, source, auxiliary, target);

		// 將第 n 個盤子從源柱子移到目標柱子
		moveCount++;
		System.out.println("移動盤子 " + n + " 從 " + source + " 到 " + target);

		// 將 n-1 個盤子從輔助柱子移到目標柱子
		moveDisks(n - 1, auxiliary, target, source);
	}

}
