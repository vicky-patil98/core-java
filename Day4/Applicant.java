package com.learning.core.day4;
//D04P03
public class Applicant {
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

