package com.learning.core.day3;

import java.util.Scanner;

public class D03P07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        //System.out.println("All subsequences of \"" + input + "\":");
        generateSubsequences(input, "");
        
    }
	
    public static void generateSubsequences(String input, String current) {
        if (input.length() == 0) {
            System.out.print(current + " ");
            return;
        }
        // Include the current character
        generateSubsequences(input.substring(1), current + input.charAt(0));
        // Exclude the current character
        generateSubsequences(input.substring(1), current);
    }
    
}
