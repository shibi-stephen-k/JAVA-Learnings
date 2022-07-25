package random;
import java.util.Random;

public class random {

	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(6)+1; // random number between 0 to 6
		System.out.println(x);
		int y = random.nextInt(6);   // random number between 0 to 5
		System.out.println(y);
		
	}

}
