package Curs11;

import Curs11.Shape;

public class Rectangle extends Shape {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(String text, String material, int width, int height) {
		super(text, material);
		this.width = width;
		this.height = height;
	}
	
	public void displayRectangleHeight() {
		System.out.println("Rectangle height is: " + this.height);
	}
	
	@Override
	public double getSize(){
		return this.width * this.height;
	}

	@Override
	public String toString() {
		return "Rectangle: height is " + this.height + ", width is: " + this.width;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Rectangle other = (Rectangle) obj;
		if ((this.text.equals(other.text) && this.material.equals(other.material)) && this.width == other.width && this.height == other.height) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + width;
		return result;
	}

	
}
