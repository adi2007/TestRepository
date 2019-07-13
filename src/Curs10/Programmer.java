package Curs10;

public class Programmer extends Employee {
	
	@Override 
	public void workTime() {
		System.out.println("A programmer works an average of 10h/day");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee man1 = new Employee();
		Employee man2 = new Programmer();
		man1.workTime();
		man2.workTime();
	}

}
