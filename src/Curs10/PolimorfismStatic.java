package Curs10;

public class PolimorfismStatic {
	
	public static void printLaturiTriunghi(int lat1) {
		System.out.println("Triunghiul are: latura1 = " + lat1);
	}
	
	public static void printLaturiTriunghi(int lat1, int lat2) {
		System.out.println("Triunghiul are: latura1 = " + lat1 + ", latura2 = " + lat2);
	}
	
	public static void printLaturiTriunghi(int lat1, int lat2, int lat3) {
		System.out.println("Triunghiul are: latura1 = " + lat1 + ", latura2 = " + lat2 + ", latura3 = " + lat3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     printLaturiTriunghi(10);
     printLaturiTriunghi(10, 20);
     printLaturiTriunghi(10, 20, 30);
	}

}
