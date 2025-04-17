package ScannerLearning;

//1. import 找到Scanner 類在哪裡
//導入要在定義類上面
import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		//2. 創建物件 表示我們要使用Scanner這個類
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入第1整數:");
		
		//3. 接收數據
		//設計變量 i  儲存鍵盤鍵入的數據
		int i = scanner.nextInt();
		System.out.println("請輸入第2整數:");
		int j = scanner.nextInt();
		
		System.out.println("兩數相加，等於:"+(i+j));
		

	}

}
