package modul2;
import java.util.Scanner;
public class Curs3 {
    //sortare crescatoare
	public static void bubbleSort(double[] values) {
		int l = values.length - 1;
		boolean isOrdered = false;
		while (!isOrdered) {
			int i = 0;
			isOrdered = true;
			while (i < l) {
				if (values[i] > values [i + 1]) {
					double aux = values[i];
					values[i] = values[i +1];
					values[i + 1] = aux;
					isOrdered  = false;					
				}
				i++;
			}
			l--;
		}
		System.out.print("sortarea crescatoare:");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}
	
	public static void bubbleSortDescrescator(double[] values) {
		int l = values.length - 1;
		boolean isOrdered = false;
		while (!isOrdered) {
			int i = 0;
			isOrdered = true;
			while (i < l) {
				if (values[i] < values [i + 1]) {
					double aux = values[i];
					values[i] = values[i +1];
					values[i + 1] = aux;
					isOrdered  = false;					
				}
				i++;
			}
			l--;
		}
		System.out.print("sortarea descrescatoare:");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduceti numarul de elemente al sirului, urmat de Enter:");
		int n = sc.nextInt();
		double [ ] arr = new double [n];
		System.out.println("introduceti sirul, urmat de Enter:");
		for (int i = 0; i < n; i++) {
			arr [i] = sc.nextDouble();
		}
		bubbleSort(arr);
		bubbleSortDescrescator(arr);
	}

}
