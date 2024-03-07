package com.learning.core.day2;
import java.util.*;

public class D02P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		int rev = 0;
		int rem = 0;
		
		while(num1 != 0) {
			rem = num1 % 10;
			rev = rem + (rev*10);
			num1 = num1 / 10;
		}
		
		System.out.println(rev);

	}

}
