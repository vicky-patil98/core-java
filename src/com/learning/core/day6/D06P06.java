package com.learning.core.day6;

import java.util.Objects;
import java.util.TreeMap;

class Car1 implements Comparable<Car1> {
    private String name;
    private double price;

    public Car1(String name, double price) {
        this.name = name;
        this.price = price;
    }


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
        Car1 Car1 = (Car1) obj;
        return Double.compare(Car1.price, price) == 0 &&
                Objects.equals(name, Car1.name);
    }

    @Override
    public int compareTo(Car1 other) {
        return (int) (this.price - other.price);
    }
}

public class D06P06 {
    public static void main(String[] args) {
        TreeMap<Car1, Double> Car1Map = new TreeMap<>();

        // Predefined information of 4 Car1 details
        Car1Map.put(new Car1("Bugatti", 80050.0), 80050.0);
        Car1Map.put(new Car1("Swift", 305000.0), 305000.0);
        Car1Map.put(new Car1("Audi", 600100.0), 600100.0);
        Car1Map.put(new Car1("Benz", 900000.0), 900000.0);

        // Retrieve the price of the Car1 in reverse order
        //System.out.println("Output:");
        for (Car1 car : Car1Map.descendingKeySet()) {
            System.out.println(car);
        }
    }
}
