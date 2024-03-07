package com.learning.core.day2;
import java.util.*;

public class D02P05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		
		if (num1 % 5 == 0) {
			System.out.println("Number is divisible by 5");
		}
		else {
			System.out.println("Number is not divisible by 5");
		}

	}

}
