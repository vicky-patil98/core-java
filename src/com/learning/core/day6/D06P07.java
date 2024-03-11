package com.learning.core.day6;

import java.util.Objects;
import java.util.TreeMap;

class Car2 implements Comparable<Car2> {
    private String name;
    private double price;

    public Car2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car2 car = (Car2) obj;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car2 other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P07 {
    public static void main(String[] args) {
        TreeMap<Car2, Double> carMap = new TreeMap<>();

        // Predefined information of 4 Car details
        carMap.put(new Car2("Bugatti", 80050.0), 80050.0);
        carMap.put(new Car2("Swift", 305000.0), 305000.0);
        carMap.put(new Car2("Audi", 600100.0), 600100.0);
        carMap.put(new Car2("Benz", 900000.0), 900000.0);

        // Retrieve the key-value mapping associated with the greatest price
        Car2 greatestPriceCar = carMap.lastKey();
        System.out.println(greatestPriceCar);

        // Retrieve the key-value mapping associated with the least price
        Car2 leastPriceCar = carMap.firstKey();
        System.out.println(leastPriceCar);
    }
}

