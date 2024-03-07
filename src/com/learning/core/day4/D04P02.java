package com.learning.core.day4;
//D04P02-1
public class D04P02 {

    public static void main(String[] args) {
        try {
            CricketRating player1 = new CricketRating("John", 9.3f, 9.67f, 8.7f);
            player1.display();
        } catch (NotEligibleException e) {
            System.out.println(e.getMessage());
        }

        try {
            CricketRating player2 = new CricketRating("Henry", 1.5f);
            player2.display();
        } catch (NotEligibleException e) {
            System.out.println("Output 2:");
            System.out.println(e.getMessage());
        }
    }
}
