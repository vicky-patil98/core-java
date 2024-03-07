package com.learning.core.day4;
import java.util.*;
//D04P03
public class D04P03 {

    public static void main(String[] args) {
        Validator validator = new Validator();
        Scanner sc = new Scanner(System.in);
        String applicantName = sc.nextLine();
        String postApplied = sc.nextLine();
        int applicantAge = sc.nextInt();
        

        // Test cases
        Applicant applicant1 = new Applicant(applicantName, postApplied, applicantAge);
        try {
            validator.validate(applicant1);
        } catch (CatheyBankException e) {
            System.out.println("Output 1:");
            System.out.println(e.getMessage());
        }

    }
}
