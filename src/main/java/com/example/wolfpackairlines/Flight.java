package com.example.wolfpackairlines;

import javafx.animation.KeyValue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.*;

public  class Flight {
    static HashMap<String, Integer> flights = new HashMap<>();

    public static HashMap<String,Integer> addFlights(){
        flights.put("Atlanta (ATL) to Ft. Lauderdale (FLL)", 120);
        flights.put("Atlanta (ATL) to New York (LGA)", 140);
        flights.put("Denver (DEN) to Los Angeles (LAX)", 150);
        flights.put("Los Angeles (LAX) to Seattle (SEA)", 170);
        flights.put("Las Vegas (LAS) to Los Angeles (LAX)", 68);
        flights.put("Atlanta (ALT) to Orlando (MCO)", 95);
        flights.put("Los Angeles (LAX) to Chicago (ORD)", 242);
        flights.put("New York (LGA) to Chicago (ORD)", 155);
        flights.put("Los Angeles (LAX) to San Francisco (SFO)", 94);
        flights.put("New York (JFK) to Los Angeles (LAX)", 326);

        return flights;
    }

    public static int time(String flight){
    return flights.get(flight);
    }

}





