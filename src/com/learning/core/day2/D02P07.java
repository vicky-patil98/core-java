package com.learning.core.day2;
import java.util.*;

public class D02P07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the first number");
		float percentage = sc.nextFloat();
		
		if (percentage >= 60) {
			System.out.println("Grade A");
		}
		else if(percentage >= 45 && percentage < 60) {
			System.out.println("Grade B");
		}
		else if(percentage >= 35 && percentage < 45) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}
	}

}
