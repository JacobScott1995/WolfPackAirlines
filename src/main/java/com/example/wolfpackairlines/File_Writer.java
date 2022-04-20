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

        ArrayList<String> customerData = new ArrayList<>(); // Creating a List of Customer input from Customer object
        customerData.add(customer.getName());
        customerData.add(customer.getEmail());
        customerData.add(customer.getPhoneNumber());
        customerData.add(customer.getGender());
        customerData.add(String.valueOf(customer.getAge()));
        customerData.add(customer.getDate());
        customerData.add(customer.getFlight());
        customerData.add(customer.getDepartTime());

        String[] data = customerData.toArray(String[]::new);



        File file = new File("src/main/resources/Boarding_Pass_Data.csv");

        FileWriter outputfile = new FileWriter(file, true);
        CSVWriter writer = new CSVWriter(outputfile);

        writer.writeNext(data);//Writing customer data to CSV file

        writer.close();
    }
}