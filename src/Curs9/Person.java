package Curs9;

public class Person extends Being{
	  private String nume;
	  private String prenume;
	  private int varsta;
	  private int numarDeOrdine;
	 
	  public Person(String species, String nume, 
	                String prenume, int varsta, int numarDeOrdine) {
	    super(species);
	    this.nume = nume;
	    this.prenume = prenume;
	    this.varsta = varsta;
	    this.numarDeOrdine = numarDeOrdine;
	  }
	 
	  @Override
	  public boolean equals(Object obj) {
	    if (this == obj) { // for performance reasons
	      return true;
	    }
	 
	    if (obj == null) {
	      return false;
	    }
	 
	    // both objects have the same type
	    if (this.getClass() != obj.getClass()) {
	      return false;
	    }
	 
	    Person personObj = (Person)obj;
	    if (super.equals(personObj) && // compares the 'Being'-parts of objects
	        this.nume.equals(personObj.nume) &&
	        this.prenume.equals(personObj.prenume) &&
	        this.varsta == personObj.varsta) {
	      return true;
	    }
	 
	    return false;
	  }
	  
	  @Override
	  public int hashCode() {
	    // This formula is used for better hash performance
	    // by avoiding duplicates for non-equal objects
	    int prime = 31;
	    int result = super.hashCode();
	    result = prime * result + ((nume == null) ? 0 : nume.hashCode());
	    result = prime * result + ((prenume == null) ? 0 : prenume.hashCode());
	    result = prime * result + varsta;
	    return result;
	  }
	}
