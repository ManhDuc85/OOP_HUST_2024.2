package learn;

import java.util.Scanner;

public class Ex225 {
	public static void main(String[] args) {
		double num1;
		double num2;
		
		System.out.println("Input first double number: ");
		Scanner myScanner = new Scanner(System.in);
		String myString = myScanner.nextLine();

		num1 = Double.parseDouble(myString);
		
		System.out.println("Input second double number: ");
		myScanner = new Scanner(System.in);
		myString = myScanner.nextLine();

		num2 = Double.parseDouble(myString);
		myScanner.close();
		double sum = num1 + num2;
		double difference = Math.abs(num1 - num2);
		double product = num1 * num2;
		System.out.println("Sum is: " + sum);
		System.out.println("Difference is: " + difference);
		System.out.println("Product is: " + product);
		if(num2 != 0) {
			double quotient = num1/num2;
			System.out.println("Quotient is: " + quotient);
		}
		else System.out.println("Not divisible!");
	}
}
