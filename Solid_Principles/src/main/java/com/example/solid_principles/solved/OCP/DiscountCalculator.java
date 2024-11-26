package com.example.solid_principles.solved.OCP;

interface Discount {
    double calculate(double amount);
}

class RegularDiscount implements Discount {
    @Override
    public double calculate(double amount) {
        return amount * 0.1; // 10% discount
    }
}

class PremiumDiscount implements Discount {
    @Override
    public double calculate(double amount) {
        return amount * 0.2; // 20% discount
    }
}

class DiscountCalculator {
    public double calculateDiscount(Discount discount, double amount) {
        return discount.calculate(amount);
    }
}

class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        Discount regularDiscount = new RegularDiscount();
        Discount premiumDiscount = new PremiumDiscount();

        System.out.println("Regular Discount: " + calculator.calculateDiscount(regularDiscount, 1000));
        System.out.println("Premium Discount: " + calculator.calculateDiscount(premiumDiscount, 1000));
    }
}
