package com.learning.core.day2;
import java.util.*;

public class D02P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		//System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		//System.out.println("Enter mathematical operator to perform the task");
		int num3 = sc.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println(num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}

	}

}
