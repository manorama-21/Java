package com.electronics;

public class ElectronicDevice {
    private String brand;
    private String model;

    public ElectronicDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void powerOn() {
        System.out.println("Powering on the electronic device");
    }
}
