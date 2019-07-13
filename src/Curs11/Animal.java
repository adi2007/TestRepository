package Curs11;

public abstract class Animal {
	  // The class has 4 fields:
	  private boolean carnivore;
	  private int weight;
	  private int size;
	  private String species;
	 
	  // The class has 1 constructor:
	  public Animal(boolean carnivore, int weight, int size, String species) {
	    this.carnivore = carnivore;
	    this.weight = weight;
	    this.size = size;
	    this.species = species;
	  }
	 
	  //The class has 3 methods:
	  public abstract void eat(int unitsOfFood); 
	 
	  public abstract void move(int distance);
	 
	  public void description() {
	    System.out.println("The animal is a " + this.species + "; has a size of "
	                       + this.size + "; weighs " + this.weight + " and is "
	                       + (this.carnivore ? "" : "not ") + "a carnivore.");
	  }
	}

