package Curs8;

import Curs8.Terrestrial;
import Curs8.Animal;
import Curs8.Rhino;
import Curs8.Zebra;
import Curs8.Tiger;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zebra zebra = new Zebra(false, 25, 40, "Mountain Zebra", 4, 2);
		Tiger tiger = new Tiger(true, 40, 70, "Siberian tiger", 4, 2);
		Tiger tiger2 = new Tiger(true, 40, 70, "Bengal tiger", 4, 2);
		Rhino rhino = new Rhino(false, 80, 70, "White rhino", 4, 2);
			 
		ArrayList<Terrestrial> zoo = new ArrayList<Terrestrial>();
		zoo.add(zebra); // 'Zebra' object upcasting to 'Terrestrial' ref. 
		zoo.add(tiger); // 'Tiger' object upcasting to 'Terrestrial' ref. 
		zoo.add(tiger2); // 'Tiger' object upcasting to 'Terrestrial' ref. 
		zoo.add(rhino); // 'Rhino' object upcasting to 'Terrestrial' ref. 
		 
		// Vocal show at the zoo:
		for(int i=0; i<zoo.size(); i++) {
		  zoo.get(i).camouflage();
		}
		
		
		
	}

}

