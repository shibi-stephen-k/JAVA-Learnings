package twoD_Arraylis;
import java.util.*;
public class TwoD_ArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> vehicles = new ArrayList();
		ArrayList<String> cars = new ArrayList();
		
		cars.add("bmw");
		cars.add("Merc");
		cars.add("Octane");
		
		ArrayList<String> bikes = new ArrayList();
		
		bikes.add("Pulsar");
		bikes.add("R15");
		bikes.add("Royal Enfield");
		
		vehicles.add(cars);
		vehicles.add(bikes);
		
		System.out.println(vehicles);

	}

}
