package day05;

public class Room {
	private String styleString;//風格
	private int size; // 人數
	private int price;// 基本價格
	private Breakfast breakfast; // 早餐
	private Transport transport; // 接送
	
	
	public Room(String styleString, int size, int price, Breakfast breakfast, Transport transport) {
		this.styleString = styleString;
		this.size = size;
		this.price = price+breakfast.getPrice()*size+transport.getPrice();
		this.breakfast = breakfast;
		this.transport = transport;
	}


	public String getStyleString() {
		return styleString;
	}


	public int getSize() {
		return size;
	}


	public int getPrice() {
		return price;
	}


	public Breakfast getBreakfast() {
		return breakfast;
	}


	public Transport getTransport() {
		return transport;
	}


	public String toString() {
		return "Room [styleString=" + styleString + ", size=" + size + ", price=" + price + ", breakfast=" + breakfast
				+ ", transport=" + transport + "]";
	}
	
	
	

}
