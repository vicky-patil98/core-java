package com.learning.core.day2;
import java.util.*;

public class D02P08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		for (int i = num1; i<=num2;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
	}

}
