package com.test;

import com.vehicles.Car;
import com.vehicles.Truck;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Farari", "Roma", 2);
        Truck truck = new Truck("Ford", "F-150", 1200);

        car.displayDetails();
        truck.displayDetails();
    }
}
