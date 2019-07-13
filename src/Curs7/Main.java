package Curs7;

import Curs7.Vehicle;
import Curs7.OnAir;
import Curs7.OnRoad;
import Curs7.OnWater;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Vehicle vehicle1 = new Vehicle("4RT567HJ", 4, "Moby");
	System.out.println("Serial number-ul este: " + vehicle1.getSerialNumber());
	System.out.println(vehicle1.goTo(1.3, 2.5));
	System.out.println(vehicle1.addFuel(3.5));
	vehicle1.printInfo();
	System.out.println();
	
	OnRoad onRoad1 = new OnRoad("VBN45678XCV", 2, "Sporty", 4, 2);
	System.out.println(onRoad1.goTo(22.4, 56.8));
	System.out.println(onRoad1.addFuel(50.3));
	onRoad1.printInfo();
	System.out.println();
	
	OnWater onWater1 = new OnWater("VESSEL12345", 80, "Ocean Cruiser", 2, 4000.0);
	System.out.println(onWater1.goTo(200.4, 500.8));
	System.out.println(onWater1.addFuel(700.5));
	onWater1.printInfo();
	System.out.println();
	
	OnAir onAir1 = new OnAir("AIR987654", 300, "Fly High", 4, true);
	System.out.println(onAir1.goTo(400.3, 900.2));
	System.out.println(onAir1.addFuel(4500.5));
	onAir1.printInfo();
	System.out.println();
	
	OnAir onAir2 = new OnAir("2345TREWS", 100, "Sky Wind", 2, false);
	System.out.println(onAir2.goTo(200.3, 700.2));
	System.out.println(onAir2.addFuel(2500.5));
	onAir2.printInfo();
	System.out.println();
		
	}

}
