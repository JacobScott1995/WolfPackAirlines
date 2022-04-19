package com.example.wolfpackairlines;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TicketDiscountTest {

    TicketDiscount test1;

    @BeforeEach
    void setup() {
        test1 = new TicketDiscount();
    }

    @Test
    void ticketDiscount() {
        double newPrice = test1.ticketDiscount(10,"Male", 100.00);
        assertEquals(50.00, newPrice);

        newPrice = test1.ticketDiscount(80,"Male", 238.50);
        assertEquals(95.40, newPrice);

        newPrice = test1.ticketDiscount(18,"Female", 250.50);
        assertEquals(187.87, newPrice);

        newPrice = test1.ticketDiscount(60,"Female", 185.75);
        assertEquals(55.72, newPrice);

        newPrice = test1.ticketDiscount(25,"Male", 85.50);
        assertEquals(85.50, newPrice);

    }
}