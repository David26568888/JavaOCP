package day05;

import java.util.Arrays;

public class CarToy {
	private int price;
	private String name;
	private Battery battery;
	private Wheel[] wheels;

	public CarToy(String name, int price, Battery battery, Wheel[] wheels) {
		this.price = price + battery.getPrice();// 車體+電池
		this.name = name;
		this.battery = battery;
		this.wheels = wheels;
		//加入輪胎的價格
		if (wheels != null && wheels.length > 0) {
			for (Wheel wheel : wheels) {
				this.price = price + wheel.getPrice();// 每個輪子+車體+電池
			}
		}
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public Battery getBattery() {
		return battery;
	}

	public Wheel[] getWheels() {
		return wheels;
	}


	public String toString() {
		return String.format("CarToy name:%s price:%d battery:%s wheels%s", name, price, battery,
				Arrays.toString(wheels));
	}

}
