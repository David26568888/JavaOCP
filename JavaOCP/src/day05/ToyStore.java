package day05;

public class ToyStore {

	public static void main(String[] args) {
		// 零件
		Battery batteryA = new Battery("A", 50);
		Battery batteryAA = new Battery("AA", 30);
		Battery batteryAAA = new Battery("AAA", 20);
		Battery batteryAAAA = new Battery("AAA", 10);
		
		Wheel wheelA = new Wheel(5,10);
		Wheel wheelB = new Wheel(7,25);
		Wheel wheelC = new Wheel(11,40);
		
		// 輪子組合
		Wheel[] wheelsA = {wheelA,wheelA,wheelA,wheelA};
		Wheel[] wheelsB = {wheelB,wheelB,wheelB,wheelB};
		Wheel[] wheelsC = {wheelC,wheelC,wheelC,wheelC};
		Wheel[] wheelsF = {wheelA,wheelB,wheelC,wheelC};

		// 玩具組合
		CarToy carToyA = new CarToy("藍寶堅尼", 250, batteryA, wheelsC);  
		CarToy carToyB = new CarToy("砲彈飛車", 100, batteryAAAA, wheelsA);
		DollToy dollToyA =new DollToy("芭比娃娃", 750); 
		DollToy dollToyB =new DollToy("電動芭比", 800,batteryAAA);
		
		// 玩具展示(武力展示)
		System.out.println(carToyA);
		System.out.println(carToyB);
		System.out.println(dollToyA);
		System.out.println(dollToyB);
		
		// 總價
		int total = 0;
		total = carToyA.getPrice()+carToyB.getPrice()+dollToyA.getPrice()+dollToyB.getPrice();
		System.out.printf("總價: %d%n",total);
		
		// 利用物件陣列將所有玩具放在一個陣列中 
		Object[] toys= {carToyA,carToyB,dollToyA,dollToyB};
		for(Object toy : toys) {
			if(toy instanceof CarToy) {// 判斷 toy 是否是 CarToy
				System.out.printf("汽車玩具:%s%n",((CarToy)toy).getName());// 轉型後取名字
			}else if (toy instanceof DollToy) {// 判斷 toy 是否是 DollToy
				System.out.printf("娃娃玩具:%s%n",((DollToy)toy).getName());// 轉型後取名字
			}
		}
	}

}
