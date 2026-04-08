import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double a = scanner.nextDouble();
		
		System.out.print("Enter second number: ");
		double b = scanner.nextDouble();
		
		System.out.print("Enter operator (+, -, *, /): ");
		char op =  scanner.next().charAt(0);
		
		double result;
		
		switch(op) {
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': 
			if(b != 0) result = a / b;
			else {
				System.out.println("Cannot divide by zero");
				return;
			}
			break;
			default:
				System.out.println("Invalid operator");
				return;
		}
		System.out.println("Result: " + result);
	}
}
