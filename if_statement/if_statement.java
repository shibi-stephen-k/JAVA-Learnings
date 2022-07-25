package if_statement;
import java.util.Scanner;
public class if_statement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		System.out.println("Enter your age : ");
		a=scanner.nextInt();
		if(a>=18)
		{
		System.out.println("You are an adult");
		}
		else
		{
		System.out.println("You are a minor");
		}
	}

}
