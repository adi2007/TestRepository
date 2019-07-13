package Curs11;

import Curs11.Animal;

public abstract class Terrestrial extends Animal {
	
	 
	  private int legs;
	  private int eyes;
	 
	  public Terrestrial(boolean carnivore, int weight, int size, String species, 
	                    int legs, int eyes) {
	    super(carnivore, weight, size, species);
	    this.legs = legs;
	    this.eyes = eyes;
	  }
	 
	  public void fight() {
	    System.out.println("The terrestrial animal is now fighting!!");
	  }
	 
	  //@Override
	  //public void move(int distance) {
	    //System.out.println("This is a terrestrial species.");
	   // super.move(distance);
	  //}
	 
	  @Override
	  public void description() {
	    System.out.println("The terrestrial animal has: " + this.legs
	                       + " legs and " + this.eyes + " eyes");
	    super.description();
	  }
	 
	  public abstract void saySomething();
	  
	  public abstract void specialCharacteristic();
	  
	  public void camouflage() {
		    System.out.println("Unknown camouflage for non-specific terrestrial animal...");
		  }
	}




