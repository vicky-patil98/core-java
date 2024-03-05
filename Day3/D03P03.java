package com.learning.core.day3;
import java.util.*;

public class D03P03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
	    System.out.println(Arrays.toString(arr));
	    int sum = 0;
	    for(int i=0; i<15;i++) {
	    	sum = sum + arr[i];
	    }
	    arr[15] = sum;
	    
	    //average
	    int sum1 = 0;
	    for(int i=0; i<arr.length;i++) {
	    	sum1 = sum1 + arr[i];
	    }
	    double avg = 0;
	    avg = (double)sum1/arr.length;
	    arr[16] = (int)avg;

	    //find the smallest
	    int small = arr[0];
	    for(int i=0; i<arr.length;i++) {
	    	if (arr[i]<small) {
	    		small = arr[i];
	    	}
	    }
	    arr[17] = small;
	    System.out.println(Arrays.toString(arr));


	}

}
