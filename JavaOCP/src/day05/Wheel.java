package day05;
//車輪
public class Wheel {
	private int price;
	private int size;//3,5,7
	
	public Wheel(int size,int price ) {
		this.price = price;
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return String.format("Wheel size: %d  price:%d ",size,price);
	}
	
	
	
	
	
}
