package day06;

//SingleTon 舉列雜貨店結帳
//設計雜貨店
public class CheckoutTest {

	public static void main(String[] args) {
		Checkout checkout = Checkout.getInstace();
		
		checkout.submit();
		checkout.submit(100);
		checkout.submit(100,"AAABBC");
		checkout.submit("1111-2222-3333-4444",100);

	}

}
