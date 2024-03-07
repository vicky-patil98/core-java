package com.learning.core.day3;
import java.util.Scanner;

public class D03P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int n = arr.length;
		System.out.println(n);
		//int indexV = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If a repeating element is found, return its index
                if (arr[i] == arr[j]) {
                     int indexV = i;
                     System.out.println(indexV);
                }
            }
        }
		
		
		
	}

}
