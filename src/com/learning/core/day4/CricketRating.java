package com.learning.core.day4;
//D04P02-2
public class CricketRating {
    private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;
    private String coins;

    public CricketRating() {
    	
	}

    public CricketRating(String playerName, float... critics) throws NotEligibleException {
        this.playerName = playerName;
        //this.critic1 = critic1;
        //this.critic2 = critic2;
        calculateAverageRating(critics);
        this.coins = calculateCoins();
    }


    public void calculateAverageRating(float... critics) {
        //this.avgRating = (critic1 + critic2) / 2;
        float sum = 0;
        int size = critics.length;
        //System.out.println("Size of var==>"+size);
        for (float avg: critics){
            sum = sum + avg;
        }
        this.avgRating = sum / size;
    }

    public String calculateCoins() throws NotEligibleException {
        if (avgRating >= 7)
            return "Gold";
        else if (avgRating >= 5 && avgRating < 7)
            return "Silver";
        else if (avgRating >= 2 && avgRating < 5)
            return "Copper";
        else
            //return "NotEligible";
        	throw new NotEligibleException();
    }

    public void display() {
        System.out.println(playerName + " " + avgRating + " " + coins);
    }
}