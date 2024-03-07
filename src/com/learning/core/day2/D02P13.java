package com.learning.core.day2;
import java.util.*;

public class D02P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		int fact = 1;
//		do {
//			fact = fact*num1;
//			num1--;
//		}while(num1!=0);

		while(num1>=1) {
			fact = fact*num1;
			num1--;
		}
		System.out.println(fact);
	}

}
