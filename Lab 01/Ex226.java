package learn;

import java.util.Scanner;

public class Ex226 {
	Scanner myScanner = null;
	String myString = null;

	static void first_degree_equation_with_one_variable() {
		System.out.println("The first-degree equation (linear equation) with one variable:");
		double a;
		Ex226 myObj = new Ex226();
		System.out.print("Input a: ");
		myObj.myScanner = new Scanner(System.in);
		myObj.myString = myObj.myScanner.nextLine();
		a = Double.parseDouble(myObj.myString);

		double b;
		System.out.print("Input b: ");
		myObj.myScanner = new Scanner(System.in);
		myObj.myString = myObj.myScanner.nextLine();
		b = Double.parseDouble(myObj.myString);
		myObj.myScanner.close();

		if (a == 0) {
			System.out.println("No solution!");
		} else {
			System.out.println("X = " + (-b / a));
		}
	}

	static void system_of_first_degree_equations_with_two_variables() {
		System.out.println("The system of first-degree equations (linear system) with two variables:");
		Ex226 myObj = new Ex226();
		double[][] a = new double[3][3];
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print("Input a" + i + j + ": ");
				myObj.myScanner = new Scanner(System.in);
				myObj.myString = myObj.myScanner.nextLine();
				a[i][j] = Double.parseDouble(myObj.myString);
			}
		}
		double[] b = new double[3];
		for (int i = 1; i <= 2; i++) {
			System.out.print("Input b" + i + ": ");
			myObj.myScanner = new Scanner(System.in);
			myObj.myString = myObj.myScanner.nextLine();
			b[i] = Double.parseDouble(myObj.myString);
		}
		myObj.myScanner.close();

		double D = a[1][1] * a[2][2] - a[1][2] * a[2][1];
		double Dx = b[1] * a[2][2] - a[1][2] * b[2];
		double Dy = a[1][1] * b[2] - b[1] * a[2][1];
		if ((Dx == 0 || Dy == 0) && D != 0) {
			System.out.println("The system have infinitely many solutions.");
		} else if (D == 0) {
			System.out.println("The system have no solution.");
		} else {
			System.out.println("X1 = " + Dx / D + ", X2 = " + Dy / D);
		}
	}

	public static void second_degree_equation_with_one_variable() {
		System.out.println("The second-degree equation with one variable:");
		Ex226 myObj = new Ex226();
		double a,b,c;
		
		System.out.print("Input a: ");
		myObj.myScanner = new Scanner(System.in);
		myObj.myString = myObj.myScanner.nextLine();
		a = Double.parseDouble(myObj.myString);
		
		System.out.print("Input b: ");
		myObj.myScanner = new Scanner(System.in);
		myObj.myString = myObj.myScanner.nextLine();
		b = Double.parseDouble(myObj.myString);
		System.out.print("Input c: ");
		
		myObj.myScanner = new Scanner(System.in);
		myObj.myString = myObj.myScanner.nextLine();
		c = Double.parseDouble(myObj.myString);
		myObj.myScanner.close();
		
		double delta = b*b - 4*a*c;
		
		if( a == 0 ) {
			if (b == 0) {
				System.out.println("No solution!");
			} else {
				System.out.println("X = " + (-c / b));
			}
		}
		else if( delta == 0) {
			System.out.println("X = " + (-b / 2*a));
		}
		else if( delta > 0) {
			System.out.println("X1 = " + ((-b + delta*(1/2))/2*a) + ", X2 = " + ((-b - delta*(1/2))/2*a));
		}
		else System.out.println("No solution!");
	}
	public static void main(String[] args) {
		first_degree_equation_with_one_variable();
		system_of_first_degree_equations_with_two_variables();
		second_degree_equation_with_one_variable();
	}
}
