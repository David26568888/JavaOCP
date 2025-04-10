package day06;


//設計結帳方式 
public class Checkout {
	private static Checkout checkout;
	
	
	private Checkout() {
		
	}
	
	public static Checkout getInstace() {
		if(checkout==null) {
			checkout =new Checkout();
		}
		return checkout;
	}
	
	public void submit(int cash) {
		System.out.printf("現金: %d 結帳%n",cash);
	}
	
	public void submit(int cash ,String qrcode) {
		System.out.printf("qrcode(%s) 結帳:%d %n",qrcode, cash);
	}
	public void submit(String cardNo,int cash) {
		System.out.printf("信用卡(%s) 結帳:%d %n",cardNo, cash);
	}
	
	public void submit() {
		System.out.printf("免結帳%n");
	}

}
