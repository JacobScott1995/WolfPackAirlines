package com.example.wolfpackairlines;

public class Price {
    private final static double basePrice = 30;
    public static double generate(int travelTime) {
        return basePrice + (travelTime * 1.3);
    }
    public static double generate(int travelTime1, int travelTime2) {
        return (basePrice * 2) + (travelTime1 + (travelTime2 * 0.1) * 1.3);
    }
}
