package day06;

//多載中 即便輸入的數值不是那個類型 僅剩下此選項 也是可以呼叫成功
// int VS Integer 中
public class OverloadingTest {

	public static void run(int x) {
		System.out.println("A");
	}
//	public static void run(long x) {System.out.println("B");}
//	public static void run(float x) {System.out.println("C");}
//	public static void run(double x) {System.out.println("D");}

	public static void run(Integer x) {
		System.out.println("E");
	}

	public static void main(String[] args) {
		run(10);

		// run(100);>>>A
		// run(100L);>>>B
		// run(3.14);>>D
		// run(3.14f);>>C
		// -------------------
		run(Integer.valueOf(10));

		run(100);// 如果註記以上其一 會出現? 先基本資料型別 在外包類型

	}

}
