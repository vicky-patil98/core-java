package com.learning.core.day6;

import java.util.*;

class Car5 implements Comparable<Car5> {
    private String name;
    private double price;

    public Car5(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
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
        Car5 car = (Car5) obj;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car5 other) {
        return Double.compare(this.price, other.price);
    }
}

public class D06P08 {
    public static void main(String[] args) {
        TreeMap<Car5, Double> carMap = new TreeMap<>();

        // Predefined car details
        carMap.put(new Car5("Bugatti", 80050.0), 80050.0);
        carMap.put(new Car5("Swift", 305000.0), 305000.0);
        carMap.put(new Car5("Audi", 600100.0), 600100.0);
        carMap.put(new Car5("Benz", 900000.0), 900000.0);

        Car5 greatestKeyCar = carMap.lastKey();
        double greatestKeyValue = carMap.remove(greatestKeyCar);
        //System.out.println(greatestKeyCar + " " + greatestKeyValue);
        
        for (Map.Entry<Car5, Double> entry : carMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
