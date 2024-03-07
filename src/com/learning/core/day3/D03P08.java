package com.learning.core.day3;

import java.util.Scanner;

public class D03P08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int deletions = minDeletionsForPalindrome(input);
        //System.out.println("Minimum deletions to make \"" + input + "\" a palindrome: " + deletions);
        System.out.println("" + deletions);

    }
    public static int minDeletionsForPalindrome(String s) {
        int n = s.length();

        int[][] dp = new int[n][n];
        
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
