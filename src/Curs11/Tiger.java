package Curs11;

import Curs11.Terrestrial;

public class Tiger extends Terrestrial {
	 
	  public Tiger(boolean carnivore, int weight, int size, 
	               String species, int legs, int eyes) {
	    super(carnivore, weight, size, species, legs, eyes);
	  }
	  
	  @Override
	  public void eat(int unitsOfFood) {
	    System.out.println("Eating meat like a tiger, " + unitsOfFood + " kg.");
	  }
	  
	  @Override
	  public void move(int distance) {
	    System.out.println("Fast moving forward like a tiger, " + 
	                       distance + " meters in " + distance * 2 + " days.");
	  }
	  
	  @Override
	  public void saySomething() {
	    System.out.println("Ggggrrrr... This tiger says something...");
	  }
	  
	  @Override
	  public void specialCharacteristic() {
	    System.out.println("I have very strong teeth and I don't fear anybody!");
	  }
	   
	}

