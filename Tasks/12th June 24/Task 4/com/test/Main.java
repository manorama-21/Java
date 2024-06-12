package com.test;

import com.electronics.SmartPhone;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone("Apple", "iPhone 14");

        smartphone.powerOn();
        smartphone.connectToWiFi();
        smartphone.makeCall();
    }
}

