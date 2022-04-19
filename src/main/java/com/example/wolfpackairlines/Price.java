package com.example.wolfpackairlines;

public class Price {
    private final double basePrice = 100;

    public double generate(int travelTime) {
        return (basePrice + (travelTime * 1.75));
    }
    public double generate(int travelTime1, int travelTime2) {
        return (basePrice + ((travelTime1+travelTime2) * 1.25));
    }
}
