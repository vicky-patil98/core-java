package com.learning.core.day2;
import java.util.*;

public class D02P02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int number = sc.nextInt();
		
		for (int i=1;i<number;i++) {
			if (i%2==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
