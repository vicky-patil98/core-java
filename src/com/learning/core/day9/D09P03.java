package com.learning.core.day9;

import java.util.Scanner;

public class D09P03{    
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;
            }    
        }    
        return -1;   
    }    
    public static void main(String a[]){ 
    	
    	Scanner sc1 = new Scanner(System.in);
    	//System.out.println("Enter the size of the Array: ");
    	int size = sc1.nextInt();
    	
    	int[] arr = new int[size];
    	
    	for (int i=0;i<arr.length;i++)
    	{
    		arr[i] = sc1.nextInt();
    	}
    	//System.out.println("Enter the element to be search:");
        int key = sc1.nextInt();    
        int result = linearSearch(arr, key);    
        if(result == -1)
        {
        	System.out.println("Element is not Present");
        }
        else {
        	System.out.println("Element is Present");
        }
    }    
} 
