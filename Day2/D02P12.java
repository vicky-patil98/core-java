package com.learning.core.day2;
import java.util.*;

public class D02P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		
		int i,j;
		
		for (i=num1;i>=1;i--) {
			for(j=i;j<num1;j++) {
				System.out.print(" ");
			}
			
			for(j=1;j<=(2*i -1);j++) {
	            System.out.print("*");
	        }
	         
	        System.out.println("");
		}
	}

}
