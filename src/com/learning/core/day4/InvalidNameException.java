package com.learning.core.day4;
//D04P03
class InvalidNameException extends CatheyBankException {
    public InvalidNameException() {
        super("Invalid Applicant Name");
    }
}
