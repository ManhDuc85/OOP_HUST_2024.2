package exercise_6_5_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex_65 {
	public static void main(String[] args) {
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		String myString = "null";
		Scanner myScanner = null;
		int sum = 0;
		while (!myString.equals("stop")) {
			System.out.print("Enter a number to extend the array, enter 'stop' to stop: ");
			myScanner = new Scanner(System.in);
			myString = myScanner.nextLine();
			if (!myString.equals("stop")) {
				myNums.add(Integer.parseInt(myString));
				sum += Integer.parseInt(myString);
			}
		}
		Collections.sort(myNums); // Sort myNumbers

		System.out.println("Sorted array: " + myNums);
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + (Double)((double)(sum)/(double)(myNums.size())));
	}
}
