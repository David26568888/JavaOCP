package day01;

public class fibonacci {
//遞迴的簡單例子
	//計算階乘
	//階乘是所有正整數的乘積，表示為 n!。例如，5! = 5 × 4 × 3 × 2 × 1。
	public static int factorial(int n) {
	    if (n == 0) { // 基本情況
	        return 1;
	    }
	    return n * factorial(n - 1); // 遞迴情況
	 
	}
//費波那契數列費波那契數列是由 0 和 1 開始，後面的數字都是前兩個數字的和。例如，0, 1, 1, 2, 3, 5, 8, 13, ...	
	public static int fibonacci(int n) {
	    if (n <= 1) { // 基本情況
	        return n;
	    }
	    return fibonacci(n - 1) + fibonacci(n - 2); // 遞迴情況
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =5;
		System.out.printf("計算階乘 %d",x);
		System.out.println(factorial(x));
		
		System.out.println("--------------------");
		
		int y=6;
		System.out.printf("計算費波那契數列第 %d個數為",y);
		System.out.println(fibonacci(6));
	}

}
