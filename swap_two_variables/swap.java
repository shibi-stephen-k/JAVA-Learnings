package swap_two_variables;

public class swap {

	public static void main(String[] args) {
		String x= "Water";
		String y= "Juice";
		
		String temp;
		
		System.out.println("Before swapping : ");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After swapping : ");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}

}
