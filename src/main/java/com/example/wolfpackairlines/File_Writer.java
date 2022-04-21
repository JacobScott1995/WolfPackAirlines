package com.example.wolfpackairlines;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class File_Writer {

    public static void main(String[] args) throws IOException {


    
    }
    // Method to collect customer data and set to csv file
    public static void addCustomerData(Customer customer) throws IOException {
        File file = new File("src/main/resources/Boarding_Pass_Data.csv");

        FileWriter outputfile = new FileWriter(file, true);
        CSVWriter writer = new CSVWriter(outputfile);
        String[] custFields = new String[9];
        custFields[0] = customer.getName();
        custFields[1] = customer.getEmail();
        custFields[2] = customer.getPhoneNumber();
        custFields[3] = customer.getGender();
        custFields[4] = String.valueOf(customer.getAge());
        custFields[5] = customer.getDate();
        custFields[6] = customer.getDepartTime();
        custFields[7] = customer.getFlight();
        custFields[8] = customer.getDepartTime();
        writer.writeNext(custFields);

        writer.close();
    }
