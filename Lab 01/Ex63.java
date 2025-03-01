package Exercise_6_3_project;

import java.util.Scanner;

public class Ex63 {
	static void starPrinter(int k) {
		for (int i = 1; i <= k; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}

	static void spacePrinter(int k) {
		for (int i = 1; i <= k; i++) {
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		System.out.print("Input n: ");
		Scanner myScanner = new Scanner(System.in);
		String myString = myScanner.nextLine();
		int n = Integer.parseInt(myString);
		myScanner.close();
		int i = n - 1;
		int j = 1;
		while (i >= 0) {
			spacePrinter(i);
			starPrinter(j);
			i--;
			j += 2;
		}
	}
}
