package switches;

public class swtiches {

	public static void main(String[] args) {
		String day = "friday";
		
		switch(day) {
		case "sunday" : System.out.println("Today is sunday");
		break;
		case "monday" : System.out.println("Today is monday");
		break;
		case "tuesday" : System.out.println("Today is tuesday");
		break;
		case "wednesday" : System.out.println("Today is wednesday");
		break;
		case "thursday" : System.out.println("Today is thursday");
		break;
		case "friday" : System.out.println("Today is friday");
		break;
		case "saturday" : System.out.println("Today is saturday");
		break;
		default : System.out.println("Wrong input");
		
		}

	}

}
