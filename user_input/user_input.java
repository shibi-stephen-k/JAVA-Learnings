package user_input;
import java.util.Scanner;

public class user_input {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name= scanner.nextLine();
		System.out.println("Your name is "+name);
		
		System.out.println("Enter your age : ");
		int age = scanner.nextInt();
		
		System.out.println("hi "+name +" You are "+age +" years old");
		
		
	}

}
