package ArrayL;

import java.util.ArrayList;

public class ArrayLis {

	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("Pizza");
		food.add("Burger");
		food.add("Noodles");
		
		food.set(0,"momos");
		food.remove(2);
		food.clear();
		
		for(int i=0; i<food.size();i++) {
			System.out.println(food.get(i));
		}

	}

}
