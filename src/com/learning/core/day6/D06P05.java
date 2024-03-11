package com.learning.core.day6;

import java.util.Objects;
import java.util.TreeMap;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car() {
		super();
	}

	public Car(String name, double price) {
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
        Car car = (Car) obj;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car other) {
        return this.name.compareTo(other.name);
    }
}

public class D06P05 {
    public static void main(String[] args) {
        TreeMap<Integer, Car> carMap = new TreeMap<>();

        // Predefined information of 4 Car details
        carMap.put(1, new Car("Bugatti", 80050.0));
        carMap.put(2, new Car("Swift", 305000.0));
        carMap.put(3, new Car("Audi", 600100.0));
        carMap.put(4, new Car("Benz", 900000.0));

        // Retrieve all car details
        for (Car car : carMap.values()) {
            System.out.println(car);
        }
    }
}

