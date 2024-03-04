package com.learning.core.day2;
import java.util.*;

public class D02P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		int pow1 = sc.nextInt();
		int result = 1;
		for(int i=1;i<=pow1;i++) {
			result = result*num1;
		}
		System.out.println(result);
	}

}
