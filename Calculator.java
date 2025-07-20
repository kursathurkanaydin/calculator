import java.sql.Time;
import java.util.Scanner;
import java.util.Timer;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isQuit = false;

		while (!isQuit){
			System.out.println("Please Enter a Number To Choose a Method\n" + 
					"Add -> 1\n" + 
					"Substract -> 2\n" +
					"Multiply -> 3\n" +
					"Divide -> 4\n" +
					"Quite -> 5");
			System.out.print("\nMethod Type : ");
			int method = scanner.nextInt();
			System.out.println("Numbers :");
			System.out.print("    Number 1 : ");
			int num1 = scanner.nextInt();
			System.out.print("    Number 2 : ");
			int num2 = scanner.nextInt();
			switch(method){
				case 1:
					System.out.printf("%d + %d = %d%n", num1, num2, num1 + num2);
					break;
				case 2:
					System.out.printf("%d - %d = %d%n", num1, num2, num1 - num2);
					break;
				case 3:
					System.out.printf("%d * %d = %d%n", num1, num2, num1 * num2);
					break;
				case 4:
					System.out.printf("%d / %d = %d%n", num1, num2, num1 / num2);
					break;	
				case 5:
					System.out.println("Quiting");	
					isQuit = true;
				default:
					System.out.println("Invalid method types");
			}
		}



	}
	
}


