package com.learning.core.day3;
import java.util.*;
public class D03P06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the number of last vowels to count: ");
        int n = scanner.nextInt();
        scanner.close();

        String lastNVowels = getLastNVowels(input, n);
        if (lastNVowels.equals("Mismatch in Vowel Count")) {
            System.out.println(lastNVowels);
        } else {
            System.out.println("Last " + n + " vowels: " + lastNVowels);
        }
    }

    public static String getLastNVowels(String input, int n) {
        StringBuilder sb = new StringBuilder();
        int vowelCount = 0;
        for (int i = input.length() - 1; i >= 0 && n > 0; i--) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.insert(0, ch);
                vowelCount++;
                n--;
            }
        }
        if (n > 0) {
            return "Mismatch in Vowel Count";
        }
        return sb.toString();
    }
}
