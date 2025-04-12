package day06;

import day07.Father;

public class Son2 extends Father {
	public void info() {
//		System.out.println(cash); // cash 是預設權限於此不可存取
		System.out.println(stock);
		//System.out.println(super.cash);// cash 是預設權限於此不可存取
		System.out.println(super.stock);
	}
}
