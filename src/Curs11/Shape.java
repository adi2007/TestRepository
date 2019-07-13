package Curs11;

public abstract class Shape {
	
	public String text;
	public String material;
	
	public Shape() {
		this.text = "";
		this.material = "";
	}

	public Shape(String text, String material) {
		this.text = text;
		this.material = material;
	}
	
	public abstract double getSize(); 
	
	@Override
	public abstract String toString(); 
	
	@Override
	public abstract boolean equals(Object obj); 
	
	@Override
	public abstract int hashCode(); 
	
}
