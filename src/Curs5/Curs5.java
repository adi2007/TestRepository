package Curs5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Curs5 {
	
	//Exercitiul 0:
	
			public static void printElements (ArrayList <String> elements) {
				for (int i = 0; i < elements.size(); i++) {
				System.out.print(elements.get(i) + " ");	
				}
				System.out.println();
			}
			
	//Exercitiul 1:
			
			public static void printCharWithMaxFrequency(String s) {
				  s = s.toLowerCase();
				 ArrayList<Character> lista = new ArrayList<Character>();
				  int maxFreq = 0;
				  for (int i=0; i<s.length(); i++) {
				    if (Character.isWhitespace(s.charAt(i))) {
				      continue;
				    }
				 
				    int charFreq = 1;
				    for (int j=i+1; j<s.length(); j++) {
				      if (s.charAt(i) == s.charAt(j)) {
				        charFreq++;
				      }
				    }
				    if (charFreq > maxFreq){
				    maxFreq = charFreq;
				    lista.clear();
				    lista.add(s.charAt(i));
				    } else if (charFreq == maxFreq) {
				    	lista.add(s.charAt(i));
				    }				    
				    }
				  System.out.println("frecventa maxima este: " + maxFreq);
				  System.out.println("caracterul cu frecventa maxima este: ");
				  for (int k = 0; k < lista.size(); k++) {
						System.out.print(lista.get(k) + " ");	
						}
			}
			
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///Exercitiul 0:
		ArrayList<String> fruits = new ArrayList<String> (Arrays.asList("apple", "pear", "cherry"));
		System.out.println("Elements are:");
		printElements(fruits);
		fruits.add("banana");
		fruits.add(1, "plum");
		System.out.println("Elements are:");
		printElements(fruits);
		System.out.println("sirul contine fructul \"pear\": " + fruits.contains("pear"));
		System.out.println("al doilea element din sir este: "  + fruits.get(1));
		fruits.set(1, "cherry");
		printElements(fruits);
		System.out.println("\"cherry\" are indexul: " + fruits.indexOf("cherry"));		
		System.out.println("ultimul index al fructului \"cherry\" este : " + fruits.lastIndexOf("cherry"));
		fruits.remove("cherry");
		System.out.println("dupa eliminarea fructului \"cherry\" sirul este : ");
		printElements(fruits);
		fruits.remove(0);
		System.out.println("dupa eliminarea primului element sirul este : ");
		printElements(fruits);
		fruits.clear();
		System.out.println("dupa stergerea tuturor elementelor sirul este : ");
		printElements(fruits);
		
		//Exercitiul 1:
		Scanner sc = new Scanner(System.in);
		System.out.println("introduceti sirul de caractere:");
		System.out.println();
		String sir = sc.nextLine();
		printCharWithMaxFrequency(sir);
	}

}
