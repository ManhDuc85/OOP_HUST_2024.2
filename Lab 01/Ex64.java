package exercise_6_4_project;

import java.util.Scanner;

public class Ex64 {

	static int DaysOfMonth(int month, int year) {
		switch (month) {
		case 2:
			return isLeapYear(year) ? 29 : 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 31;
		}
	}

	static boolean isLeapYear(int year) {
		return (year%4 == 0 && year%100 != 0)||(year%400 == 0);
	}

	static int monthCheck(String myMonth) {
		int month;
		switch (myMonth) {
		case "january":
		case "jan.":
		case "jan":
		case "1":
			month = 1;
			break;
		case "february":
		case "feb.":
		case "feb":
		case "2":
			month = 2;
			break;
		case "march":
		case "mar.":
		case "mar":
		case "3":
			month = 3;
			break;
		case "april":
		case "apr.":
		case "apr":
		case "4":
			month = 4;
			break;
		case "may":
		case "5":
			month = 5;
			break;
		case "june":
		case "jun":
		case "6":
			month = 6;
			break;
		case "july":
		case "jul":
		case "7":
			month = 7;
			break;
		case "august":
		case "aug.":
		case "aug":
		case "8":
			month = 8;
			break;
		case "september":
		case "sept.":
		case "sep":
		case "9":
			month = 9;
			break;
		case "october":
		case "oct.":
		case "oct":
		case "10":
			month = 10;
			break;
		case "november":
		case "nov.":
		case "nov":
		case "11":
			month = 11;
			break;
		case "december":
		case "dec.":
		case "dec":
		case "12":
			month = 12;
			break;
		default:
			System.out.println("Invalid month input!");
			return 0;
		}
		return month;
	}

	public static void main(String[] args) {
		Scanner myScanner;
		String myMonth = null;
		int month = 0;
		while (month == 0) {
			System.out.print("Enter a month(Ex: January, Jan., Jan, and 1): ");
			myScanner = new Scanner(System.in);
			myMonth = myScanner.nextLine().toLowerCase();
			month = monthCheck(myMonth);
		}

		String myYear = null;
		int year = 0;
		while (year <= 0) {
			System.out.print("Enter a year (example: 1999): ");
			myScanner = new Scanner(System.in);
			myYear = myScanner.nextLine();
			year = Integer.parseInt(myYear);
			if (year <= 0) {
				System.out.println("Invalid year input!");
			}
		}

		System.out.println("Number of days there are in " + myMonth + " " + myYear + ": " + DaysOfMonth(month,year));
	}

}