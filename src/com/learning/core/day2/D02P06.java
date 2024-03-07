package com.learning.core.day2;
import java.util.*;

public class D02P06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the first number");
		int day_number = sc.nextInt();
		
        if (day_number == 1) {
            System.out.println("Monday");
        } else if (day_number == 2) {
            System.out.println("Tuesday");
        } else if (day_number == 3) {
            System.out.println("Wednesday");
        } else if (day_number == 4) {
            System.out.println("Thursday");
        } else if (day_number == 5) {
            System.out.println("Friday");
        } else if (day_number == 6) {
            System.out.println("Saturday");
        } else if (day_number == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

	}

}
