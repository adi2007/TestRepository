package Curs11;

import Curs11.Terrestrial;

public class Zebra extends Terrestrial {
	 
	  public Zebra(boolean carnivore, int weight, int size, 
	               String species, int legs, int eyes) {
	    super(carnivore, weight, size, species, legs, eyes);
	  }
	  
	  @Override
	  public void eat(int unitsOfFood) {
	    System.out.println("Eating grass like a zebra, " + unitsOfFood + " kg.");
	  }
	  
	  @Override
	  public void move(int distance) {
	    System.out.println("Fast moving forward like a zebra, " + 
	                       distance + " meters in " + distance * 4 + " days.");
	  }
	 
	  @Override
	  public void saySomething() {
	    System.out.println("Wzzeeaaaa... This zebra says something...");
	  }
	  
	  @Override
	  public void specialCharacteristic() {
	    System.out.println("We stay together and confuse the enemy!");
	  }
	 
	}