package Curs10;

import Curs10.Smartphone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Smartphone smartphone = new Smartphone(1000, 5, 10, 1, 100, 99, 100, 99);
		
		smartphone.pressVolumeUp();
		System.out.println();
		smartphone.pressVolumeDown();
		System.out.println();
		smartphone.pressVolumeUp();
		System.out.println();
		smartphone.pressVolumeUp();
		System.out.println();
	}

}
