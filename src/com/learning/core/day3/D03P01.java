package com.learning.core.day3;
import java.util.*;

public class D03P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String strVal = sc.next();
		
		System.out.println("Length of the String: "+strVal.length());
		
		System.out.println("Upper Case: "+strVal.toUpperCase());
		
		//Check if the String is palindrome or not
		String temp = "";
		for (int i=0;i<strVal.length();i++) {
			temp = strVal.charAt(i) + temp;
		}
		
		//System.out.println("===="+temp);
		if (strVal.equals(temp)) {
			System.out.println("It is a Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
	

	}

}
