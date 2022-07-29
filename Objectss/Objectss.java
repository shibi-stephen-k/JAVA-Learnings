package Objectss;

public class Objectss {

	public static void main(String[] args) {
		car mycar = new car();
		System.out.println(mycar.company);
		System.out.println(mycar.name);
		System.out.println(mycar.price);
		System.out.println(mycar.year);
		mycar.drive();
		mycar.stop();
	}

}
