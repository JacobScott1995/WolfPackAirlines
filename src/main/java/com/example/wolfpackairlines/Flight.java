package com.example.wolfpackairlines;

import javafx.animation.KeyValue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.*;

public  class Flight {
    static HashMap<String, Integer> flights = new HashMap<>();

    public static void addFlights(){
        flights.put("Atlanta (ATL) to Ft. Lauderdale (FLL)", 120);
        flights.put("Atlanta (ATL) to New York (LGA)", 390);
        flights.put("Denver (DEN) to Los Angeles (LAX)", 386);
        flights.put("Los Angeles (LAX) to Seattle (SEA)", 300);
        flights.put("Las Vegas (LAS) to Los Angeles (LAX)", 68);
        flights.put("Atlanta (ALT) to Orlando (MCO)", 95);
        flights.put("Los Angeles (LAX) to Chicago (ORD)", 242);
        flights.put("New York (LGA) to Chicago (ORD)", 155);
        flights.put("Los Angeles (LAX) to San Francisco (SFO)", 94);
        flights.put("New York (JFK) to Los Angeles (LAX)", 326);

    }

    public static int time(String flight){
    return flights.get(flight);
    }

}





