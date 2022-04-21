package com.example.wolfpackairlines;

public class TicketDiscount {

    public static double ticketDiscount(int age, String gender, double originalPrice) {
        double newPrice;
        if (age <= 12) {
            newPrice = originalPrice - (originalPrice * .50);
            if (gender.equals("Female")) {
                newPrice = newPrice - (newPrice * .25);
            }
        }
        else if (age >= 60) {
            newPrice = originalPrice - (originalPrice * .60);
            if (gender.equals("Female")) {
                newPrice = newPrice - (newPrice * .25);
            }
        }
        else if (gender.equals("Female")) {
            newPrice = originalPrice - (originalPrice * .25);
        }
        else {
            newPrice = originalPrice;
        }

        //truncates to two decimal values
        newPrice = newPrice * 100;
        newPrice = Math.floor(newPrice);
        newPrice = newPrice / 100;

        return newPrice;
    }
}
