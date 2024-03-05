package com.learning.core.day3;
import java.util.*;

public class D03P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number between 1 to 40");
		int start = sc.nextInt();
		
		System.out.println("Enter the second number between 1 to 40");
		int end = sc.nextInt();
		
		System.out.println("Enter the 5 elements between 1 to 40");
		//create a array of size 5
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		//print the array entered
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		//Check if both numbers are present
		boolean found1= false;
		boolean found2 = false;
		for(int i=0;i<arr.length;i++) 
		{
			if (arr[i]==start) {
				found1=true;
			}
			if (arr[i]==end) {
				found2=true;
			}
		}
		
		if (found1 && found2) {
			System.out.println("Bingo");
		}
		else {
			System.out.println("Not Found");
		}

	}

}
