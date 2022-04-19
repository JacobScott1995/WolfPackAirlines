package com.example.wolfpackairlines;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class File_Writer {

    public static void main(String[] args) throws IOException {


    }
    // Method to collect customer data and set to csv file
    public static void addCustomerData(ArrayList<String> arrstr) throws IOException {
        File file = new File("src/main/resources/Boarding_Pass_Data.csv");

        FileWriter outputfile = new FileWriter(file, true);
        CSVWriter writer = new CSVWriter(outputfile);


        writer.writeAll((Iterable<String[]>) arrstr);


        writer.close();
    }


}