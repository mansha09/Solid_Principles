package com.example.solid_principles.violated.OCP;

public class DiscountCalculator {
    public double calculateDiscount(String userType, double amount) {
        if (userType.equals("Regular")) {
            return amount * 0.1; // 10% discount
        } else if (userType.equals("Premium")) {
            return amount * 0.2; // 20% discount
        }
        return 0;
    }

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Regular Discount: " + calculator.calculateDiscount("Regular", 1000));
        System.out.println("Premium Discount: " + calculator.calculateDiscount("Premium", 1000));
    }
}
