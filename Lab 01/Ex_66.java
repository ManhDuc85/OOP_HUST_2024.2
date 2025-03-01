package exercise_6_6_project;

import java.util.Scanner;

public class Ex_66 {
	public static void main(String[] args) {
		Scanner myScanner = null;
		String myString = null;
		System.out.print("Input n: ");
		myScanner = new Scanner(System.in);
		myString = myScanner.nextLine();
		int n = Integer.parseInt(myString);
		int[][] a = new int[n+1][n+1];
		int input = 0;
		while(input!=2) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("Input a" + i + j + ": ");
				myScanner = new Scanner(System.in);
				myString = myScanner.nextLine();
				if(input == 0) a[i][j] = Integer.parseInt(myString);
				else if(input == 1)a[i][j] += Integer.parseInt(myString);
			}
		}
		input++;
		}
		System.out.println("Sum matrix:");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(a[i][j] < 9) System.out.print("0" + a[i][j] + " ");
				else System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
