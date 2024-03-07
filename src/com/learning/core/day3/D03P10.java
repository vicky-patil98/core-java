package com.learning.core.day3;

import java.util.Scanner;

public class D03P10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        int longestPrefixSuffixLength = longestPrefixSuffix(s);
        //System.out.println("Length of the longest prefix-suffix: " + longestPrefixSuffixLength);
        System.out.println(" " + longestPrefixSuffixLength);
    }

    public static int longestPrefixSuffix(String s) {
        int n = s.length();
        for (int i = n / 2; i >= 0; i--) {
            if (s.substring(0, i).equals(s.substring(n - i))) {
                return i;
            }
        }
        return 0;
    }

}
