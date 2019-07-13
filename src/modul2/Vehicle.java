package modul2;

public class Vehicle {
	
	private static final String producedBy = "renault";
	private final int productionYear;
	private final String vin;
	private String plateNumber;
	private double kilometers;
	private int lastSoldOnYear;
	private double positionX;
	private double positionY;
	
	
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public double getKilometers() {
		return kilometers;
	}
	
	public Vehicle(int productionYear, String vin, String plateNumber, int kilometers, int lastSoldOnYear, double positionX, double positionY) {
		this.productionYear = productionYear;
		this.vin = vin;
		this.plateNumber = plateNumber;
		this.kilometers = kilometers;
		this.lastSoldOnYear  = lastSoldOnYear;
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	public Vehicle(int productionYear, String vin, String plateNumber, int kilometers, int lastSoldOnYear) {
		this(productionYear, vin, plateNumber, kilometers, lastSoldOnYear, 0.0, 0.0);
	
	}
	
	public void sellVehicle(String plateNumber, int lastSoldOnYear) {
		this.plateNumber = plateNumber;
		this.lastSoldOnYear = lastSoldOnYear;
	}
	
	public void moveCar(double positionX, double positionY) {
		kilometers = Math.sqrt((positionX-this.positionX)*(positionX-this.positionX) + (positionY-this.positionY)*(positionY-this.positionY));
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	public boolean isVinValid(boolean isDrivingInNorthAmerica) {
		if (!isDrivingInNorthAmerica) {
			return true;
		} else {
			if (vin.length() != 17) {
				return false;
			} else {
				char [ ] arr =vin.toCharArray();
				int [ ] num = new int [17];
				for (int i=0; i<17; i++) {
					if (i==8) {
						continue;
					} else {
						if (Character.isDigit(arr[i])) {
							num [i] = arr[i] - '0';				///am transformat caracterul '5' (de exemplu) in numarul intreg 5			
						} else {
							switch (arr[i]) {
							case 'A':
							case 'J':	
								num [i] = 1;
							break;
							case 'B':
							case 'K':
							case 'S':
								num [i] = 2;
								break;
							case 'C':
							case 'L':
							case 'T':
								num [i] = 3;
								break;
							case 'D':
							case 'M':
							case 'U':
								num [i] = 4;
								break;	
							case 'E':
							case 'N':
							case 'V':
								num [i] = 5;
								break;	
							case 'F':
							case 'W':	
								num [i] = 6;
							break;
							case 'G':
							case 'P':
							case 'X':
								num [i] = 7;
								break;		
							case 'H':
							case 'Y':	
								num [i] = 8;
							break;	
							case 'R':
							case 'Z':	
								num [i] = 9;
							break;	
							}
						}
					}
				}
				int [ ] weight = {8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2};
				int sum = 0;
				for(int i = 0; i < 17; i++) {
					sum += num[i] * weight[i];
				}
				char [ ] aux = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'X'}; // va fi aux[0]='0',....aux[5]='5', ...aux[10]='X'
				if (aux[sum%11] == arr[8]) {
					return true;
				} else {
					return false;
				}
				
							
				
			}
			
			
			
			
		}
	}
	
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicle masina1 = new Vehicle(2003, "1M8GDM9AXKP042788", "B123NHK", 14567, 2009);
System.out.println(masina1.isVinValid(true));
Vehicle masina2 = new Vehicle(2003, "5M8GDM9AXKP042788", "B123NHK", 14567, 2009);
System.out.println(masina2.isVinValid(true));
	}

}
