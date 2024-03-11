package com.learning.core.day4;
import java.util.Scanner;
//D04P03
class CatheyBankException extends Exception {
    public CatheyBankException(String message) {
        super(message);
    }
}

class InvalidAgeException extends CatheyBankException {
    public InvalidAgeException() {
        super("Invalid Age");
    }
}

class InvalidNameException extends CatheyBankException {
    public InvalidNameException() {
        super("Invalid Applicant Name");
    }
}

class InvalidPostException extends CatheyBankException {
    public InvalidPostException() {
        super("Invalid Post");
    }
}

class Validator {
    public void validate(Applicant applicant) throws CatheyBankException {
        if (!isValidApplicantName(applicant.getApplicantName())) {
            throw new InvalidNameException();
        }
        if (!isValidPost(applicant.getPostApplied())) {
            throw new InvalidPostException();
        }
        if (!isValidAge(applicant.getApplicantAge())) {
            throw new InvalidAgeException();
        }
        System.out.println("All details are valid");
    }

    public boolean isValidApplicantName(String name) {
        return name != null && !name.isEmpty();
    }

    public boolean isValidPost(String post) {
        return post.equals("Probationary Officer") || post.equals("Assistant") || post.equals("Special Cadre Officer");
    }

    public boolean isValidAge(int age) {
        return age > 18 && age <= 30;
    }
}

class Applicant {
    private String applicantName;
    private String postApplied;
    private int applicantAge;

    public Applicant(String applicantName, String postApplied, int applicantAge) {
        this.applicantName = applicantName;
        this.postApplied = postApplied;
        this.applicantAge = applicantAge;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getPostApplied() {
        return postApplied;
    }

    public int getApplicantAge() {
        return applicantAge;
    }
}

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
            //System.out.println("Output 1:");
            System.out.println(e.getMessage());
        }

    }
}
