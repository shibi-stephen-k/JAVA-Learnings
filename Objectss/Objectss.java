package Objectss;

public class Objectss {

	public static void main(String[] args) {
		car mycar = new car();
		car mycar2 = new car();
		System.out.println(mycar.company);
		System.out.println(mycar.name);
		System.out.println(mycar.price);
		System.out.println(mycar.year);
		mycar.drive();
		mycar.stop();
		
		System.out.println(mycar2.company);
		System.out.println(mycar2.name);
		System.out.println(mycar2.price);
		System.out.println(mycar2.year);
		mycar2.drive();
		mycar2.stop();
		
	}

}
