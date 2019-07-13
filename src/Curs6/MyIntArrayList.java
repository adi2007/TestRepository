package Curs6;
import java.util.Arrays;

public class MyIntArrayList {
	
	
	  private int[] elements;
	  private int size = 0;
	 
	  public MyIntArrayList() {
	    this(10);
	  }
	 
	  public MyIntArrayList(int initialCapacity) {
	    this.elements = new int[initialCapacity];
	  }
	
	  ///copie de la array-ul nostru intern(cand vrem sa scoatem array-ul nostru in afara clasei noastre):
	  public int [] myClone() {
	       return Arrays.copyOf(elements, size);
	  }
	  
	///al treilea constructor:
	  public MyIntArrayList(MyIntArrayList c) {
		  this.elements = new int[c.size()];
		  this.size = c.size();
		  for (int i = 0; i < c.size(); i++) {
			  this.elements[i] = c.elements[i];
		  }
	  }
	  
	  public boolean add(int e) {
		    if (this.size == this.elements.length) {
		      this.elements = Arrays.copyOf(this.elements, this.size * 2);
		    }
		 
		    this.elements[size] = e;
		    this.size++;
		 
		    return true;
		  }
	  
	  ///metoda void add:
	  public void add(int index, int element) {
		  if (this.size == this.elements.length) {
		      this.elements = Arrays.copyOf(this.elements, this.size * 2);
		    }
		  for (int i = this.size - 1; i >= index; i--) {
			  this.elements[i+1] = this.elements[i];
		  }
		  this.elements[index] = element;
		  this.size++;
	  }

	  public int size() {
		    return this.size;
		  }
	
	  ////metoda contains:
	  public boolean contains(int e) {
		  for (int i = 0; i < this.size(); i++) {
			  if (this.elements[i] == e) {
				  return true;
			  }
		  }
		  return false;
	  }
	
	  ////metoda get:
	  public int get(int index) {
		  return this.elements[index];
	  }
	
	  public int indexOf(int e) {
		    for (int i=0; i<this.size; i++) {
		      if (this.elements[i] == e) {
		        return i;
		      }
		    }
		    return -1;
		  }
	  
	  ///metoda lastIndexOf:
	  public int lastIndexOf(int e) {
		  for (int i=this.size - 1; i >= 0; i--) {
		      if (this.elements[i] == e) {
		        return i;
		      }
		    }
		    return -1;
		  }
	  
	  
	  ///metoda remove:
	  public boolean remove(int e) {
		  for (int i=0; i<this.size; i++) {
			  if (this.elements[i]==e) {
				  for (int j=i; j<this.size-2; j++) {
					  this.elements[j]=this.elements[j+1];
				  }
				  this.size--;
				  return true;
			  }
		  }
		  return false;		  
	  }
	  
		
	  public int removeElementAtIndex(int index) {
		    if (index < 0 || index >= this.size) {
		      // should throw IndexOutOfBoundsException
		      System.out.println("Throwing IndexOutOfBoundsException when trying to" +
		                         " remove element at position " + index);
		      return -1;
		    }
		 
		    int removedElement = this.elements[index];
		    for (int i=index; i<this.size; i++) {
		      this.elements[i] = this.elements[i+1];
		    }
		    this.size--;
		 
		    return removedElement;
		  }
	
	
	  public void clear() {
		    this.size = 0;
		  }
	
	  
	  public int set(int index, int e) {
		    if (index < 0 || index >= this.size) {
		      // should throw IndexOutOfBoundsException
		      System.out.println("Throwing IndexOutOfBoundsException when trying to set" +
		                         " the element " + e + " at position " + index);
		      return -1;
		    }
		 
		    int replacedElement = this.elements[index];
		    this.elements[index] = e;
		    return replacedElement;
		  }
	  
	  ///metoda boolean addAll:
	  public boolean addAll(MyIntArrayList c) {
		  if (c == null) {
			  return false;
		  } else {
			  	if ((this.size + c.size()) > this.elements.length) {
			  		this.elements = Arrays.copyOf(this.elements, this.size + c.size());
		         }
			  	for (int i=this.size; i<(this.size + c.size()); i++) {
			  		this.elements[i] = c.elements[i-this.size];
			  	}
			  	this.size += c.size();
			  	return true;
	        }
       }
	  
	  ///metoda boolean addAll(int index, MyIntArrayList c):
	  public boolean addAll(int index, MyIntArrayList c) {
		  if (c == null) {
			  return false;
		  } else {
			  	if ((this.size + c.size()) > this.elements.length) {
			  		this.elements = Arrays.copyOf(this.elements, this.size + c.size());
		         }
			  	for (int i=index; i<this.size;i++) {
			  		this.elements[i+c.size()]=this.elements[i];
			  	}
			  	for (int i=index; i<index + c.size();i++) {
			  		this.elements[i] = c.elements[i-index];
			  	}
			  	this.size += c.size();
			  	return true;
	       }
	  }
	  
	  
	  ///metoda int[] toArray():
	  public int[] toArray() {
		 
		  return Arrays.copyOf(this.elements, this.size);
	  }
	  
	  ///metoda void ensureCapacity(int minCapacity):
	  public  void ensureCapacity(int minCapacity) {
		  this.elements = Arrays.copyOf(this.elements, minCapacity);
	  }
	  
	  ///metoda void trimToSize():
	  public void trimToSize() {
		  if (this.size == 0) {
			  System.out.println("eroare deoarece dimensiunea este 0");
		  } else {
		       this.elements = Arrays.copyOf(this.elements, this.size);
	        }
	  }
	  
	  ///metoda printare:
	  public void printare() {
		  for(int i=0;i<this.size; i++) {
			  System.out.print(this.elements[i] + " ");
		  }
		  System.out.println();
	  }
	  
	  public static void main(String[] args) {
		  MyIntArrayList testArray = new MyIntArrayList(20);
		  testArray.add(2);
		  testArray.add(0, 5);
		  testArray.printare();
		  testArray.add(7);
		  testArray.add(1, 10);
		  testArray.printare();
		  System.out.println(testArray.contains(2));
		  System.out.println(testArray.get(3));
		  System.out.println(testArray.remove(5));
		  testArray.printare();
		  testArray.add(20);
		  testArray.add(30);
		  testArray.add(10);
		  testArray.printare();
		  System.out.println(testArray.lastIndexOf(10));
		  testArray.trimToSize();
		  testArray.printare();
		  int [] newtest = testArray.toArray();
		  for (int i=0; i<newtest.length; i++) {
			  System.out.print(newtest[i] +" ");
		  }
		  
	  }
	  
}	  
