package Curs9;

import Curs9.Being;
import Curs9.Person;
import Curs9.Shape;
import Curs9.Triangle;
import Curs9.Rectangle;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Exercitiul 0.1:
		Person person1 = new Person("Human", "Ionescu", "Virgil", 54, 12) ;
		Person person2 = new Person("Human", "Ionescu", "Petre", 54, 12) ;
		Person person3 = new Person("Human", "Ionescu", "Virgil", 54, 96) ;
		Person person4 = new Person("Animal", "Ionescu", "Virgil", 54, 12) ;
		
		System.out.println("Exercitiul 0.1:");
		System.out.println("Is person1 equal with person2 ?: " + person1.equals(person2));
		System.out.println("Is person1 equal with person3 ?: " + person1.equals(person3));
		System.out.println("Is person1 equal with person4 ?: " + person1.equals(person4));
		System.out.println();
		
		//Exercitiul 0.2:
		System.out.println("Exercitiul 0.2:");
		System.out.println("Person1 hashCode is (should be equal with person3 hashCode): " + person1.hashCode());
		System.out.println("Person2 hashCode is: " + person2.hashCode());
		System.out.println("Person3 hashCode is (should be equal with person1 hashCode): " + person3.hashCode());
		System.out.println("Person4 hashCode is: " + person4.hashCode());
		System.out.println("Person2 hashCode is (should remain the same as before): " + person2.hashCode());
		System.out.println("Person3 hashCode is (should remain the same as before): " + person3.hashCode());
		System.out.println();
		
		//Forme geometrice:
		System.out.println("Exercitiul Forme geometrice:");
		Shape shape1 = new Shape();
		Shape shape2 = new Shape("Math is easy", "plastic");
		Shape shape3 = new Shape("shape3", "plastic");
		Shape shape4 = new Shape("Math is easy", "plastic");
		
		System.out.println("shape1 size: " + shape1.getSize());
		System.out.println("shape2 size: " + shape2.getSize());
		
		System.out.println("toString of shape1: " + shape1);
		System.out.println("toString of shape2: " + shape2);
		System.out.println("toString of shape3: " + shape3);
		System.out.println("toString of shape4: " + shape4);
		
		System.out.println("is shape2 equals shape4? : " + shape2.equals(shape4));
		System.out.println("is shape3 equals shape4? : " + shape3.equals(shape4));
		
		System.out.println("hashCode of shape1: " + shape1.hashCode());
		System.out.println("hashCode of shape2: " + shape2.hashCode());
		System.out.println("hashCode of shape3: " + shape3.hashCode());
		System.out.println("hashCode of shape4: " + shape4.hashCode());
		System.out.println();
		
		Triangle triangle1 = new Triangle(50, 70);
		Triangle triangle2 = new Triangle("I reflect light", "glass", 23, 11);
		Triangle triangle3 = new Triangle("I reflect light", "glass", 23, 11);
		Triangle triangle4 = new Triangle("triangle4", "glass", 20, 40);
		
		triangle1.displayTriangleHeight();
		triangle2.displayTriangleHeight();
		triangle3.displayTriangleHeight();
		triangle4.displayTriangleHeight();
		
		System.out.println("triangle1 size is: " + triangle1.getSize());
		System.out.println("triangle2 size is: " + triangle2.getSize());
		System.out.println("triangle3 size is: " + triangle3.getSize());
		System.out.println("triangle4 size is: " + triangle4.getSize());
		
		System.out.println("toString of triangle1: " + triangle1);
		System.out.println("toString of triangle2: " + triangle2);
		System.out.println("toString of triangle3: " + triangle3);
		System.out.println("toString of triangle4: " + triangle4);
		
		System.out.println("is triangle2 equals triangle3? : " + triangle2.equals(triangle3));
		System.out.println("is triangle2 equals triangle4? : " + triangle2.equals(triangle4));
		
		System.out.println("hashCode of triangle1: " + triangle1.hashCode());
		System.out.println("hashCode of triangle2: " + triangle2.hashCode());
		System.out.println("hashCode of triangle3: " + triangle3.hashCode());
		System.out.println("hashCode of triangle4: " + triangle4.hashCode());
		System.out.println();
		
		Rectangle rectangle1 = new Rectangle(22, 33);
		Rectangle rectangle2 = new Rectangle("Yellow rectangle", "steel", 10, 50);
		Rectangle rectangle3 = new Rectangle("Yellow rectangle", "steel", 10, 50);
		Rectangle rectangle4 = new Rectangle("rectangle4", "glass", 60, 15);
		
		rectangle1.displayRectangleHeight();
		rectangle2.displayRectangleHeight();
		rectangle3.displayRectangleHeight();
		rectangle4.displayRectangleHeight();
		
		System.out.println("rectangle1 size is: " + rectangle1.getSize());
		System.out.println("rectangle2 size is: " + rectangle2.getSize());
		System.out.println("rectangle3 size is: " + rectangle3.getSize());
		System.out.println("rectangle4 size is: " + rectangle4.getSize());
		
		System.out.println("toString of rectangle1: " + rectangle1);
		System.out.println("toString of rectangle2: " + rectangle2);
		System.out.println("toString of rectangle3: " + rectangle3);
		System.out.println("toString of rectangle4: " + rectangle4);
		
		System.out.println("is rectangle2 equals rectangle3? : " + rectangle2.equals(rectangle3));
		System.out.println("is rectangle2 equals rectangle4? : " + rectangle2.equals(rectangle4));
		
		System.out.println("hashCode of rectangle1: " + rectangle1.hashCode());
		System.out.println("hashCode of rectangle2: " + rectangle2.hashCode());
		System.out.println("hashCode of rectangle3: " + rectangle3.hashCode());
		System.out.println("hashCode of rectangle4: " + rectangle4.hashCode());
		System.out.println();
		
		ArrayList <Shape> array = new ArrayList <Shape>();
		array.add(shape3);
		array.add(shape4);
		array.add(triangle3);
		array.add(triangle4);
		array.add(rectangle3);
		array.add(rectangle4);
		
		System.out.println("toString of shape3: " + array.get(0));
		System.out.println("toString of shape4: " + array.get(1));
		System.out.println("toString of triangle3: " + array.get(2));
		System.out.println("toString of triangle4: " + array.get(3));
		System.out.println("toString of rectangle3: " + array.get(4));
		System.out.println("toString of rectangle4: " + array.get(5));
		
		System.out.println("size of shape3: " + array.get(0).getSize());
		System.out.println("size of shape4: " + array.get(1).getSize());
		System.out.println("size of triangle3: " + array.get(2).getSize());
		System.out.println("size of triangle4: " + array.get(3).getSize());
		System.out.println("size of rectangle3: " + array.get(4).getSize());
		System.out.println("size of rectangle4: " + array.get(5).getSize());
		System.out.println();
		
		for (int i=0; i<array.size(); i++) {
			if (array.get(i) instanceof Triangle) {
				Triangle triangle = (Triangle) array.get(i);
				triangle.displayTriangleHeight();
			} else if (array.get(i) instanceof Rectangle) {
				Rectangle rectangle = (Rectangle) array.get(i);
				rectangle.displayRectangleHeight();
			}
			
		}
	}

}
