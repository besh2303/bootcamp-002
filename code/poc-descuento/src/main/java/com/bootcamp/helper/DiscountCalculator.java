package com.bootcamp.helper;

public class DiscountCalculator {

    public double calculateDiscount(double price, double percentage) {
        return price - (price * percentage / 100);
    }
}
