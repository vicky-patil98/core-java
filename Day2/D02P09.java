package com.learning.core.day2;
import java.util.*;

public class D02P09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		int cube = 0;
		for (int i= 1;i<=num1;i++) {
			cube = i*i*i;
			System.out.print(cube +" ");
		}
	}

}
