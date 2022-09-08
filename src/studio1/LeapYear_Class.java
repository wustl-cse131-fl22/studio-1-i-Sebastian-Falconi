package studio1;

import java.util.Scanner;

public class LeapYear_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("First Leap Year check value: " );              //Print "input value" statement
		int year = in.nextInt();										   //Input year value
		int four = year%4;												   //Test if evenly divisible by 4
		int hundred = year%100;											   //Test if evenly divisible by 100
		int fourHundred = year%400; 									   //Test if evenly divisible by 400
		boolean leapYear = four == 0 && hundred != 0 || fourHundred == 0;  //Test if divisible by 4 and not 100, OR by 400
		System.out.println( year + " is a leap year: " + leapYear);		   //Output if leap year or not
		
	}

}
