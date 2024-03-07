// Java program to find Union and intersection of
// two sorted arrays
package com.learning.core.day3;
import java.util.*;
public class D03P14 {

	public static void printUnion(int[] arr1, int[] arr2) {

		int i = 0;
		int j = 0;
		
        System.out.print("Union: ");
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				System.out.print(arr1[i] + " ");
				i = nextDistinct(arr1, i);
			} else if (arr1[i] > arr2[j]) {
				System.out.print(arr2[j] + " ");
				j = nextDistinct(arr2, j);
			} else {
				System.out.print(arr1[i] + " ");
				i = nextDistinct(arr1, i);
				j = nextDistinct(arr2, j);
			}
		}
		
		while (i < arr1.length) {
			System.out.print(arr1[i] + " ");
			i = nextDistinct(arr1, i);
		}
		
		while (j < arr2.length) {
			System.out.print(arr2[j] + " ");
			j = nextDistinct(arr2, j);
		}
	}
	public static int nextDistinct(int[] arr, int x) {

		while (x < arr.length - 1 && arr[x] == arr[x + 1]) {
			x++;
		}
		return x + 1;
	}
	//====================================Union===========

	static void printIntersection(int arr1[], int arr2[], int m, int n)
	{
		int i = 0, j = 0;
        System.out.print("Intersection: ");
		while (i < m && j < n) {
			if (i > 0 && arr1[i] == arr1[i - 1]) 
			{
				i++;
				continue;
			}
			if (arr1[i] < arr2[j])
				i++;
			else if (arr2[j] < arr1[i])
				j++;
			else {
				System.out.print(arr2[j++] + " ");
				i++;
			}
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        //System.out.print("Enter a string: ");
        int input1 = sc.nextInt();

        int[] arr1 = new int[input1];
        for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
        int input2 = sc.nextInt();
        int[] arr2 = new int[input2]; 
        for(int i=0;i<arr2.length;i++) {
			arr2[i] = sc.nextInt();
		}

		printUnion(arr1, arr2);
		int m = arr1.length;
		int n = arr2.length;
		printIntersection(arr1, arr2, m, n);
	}
}
