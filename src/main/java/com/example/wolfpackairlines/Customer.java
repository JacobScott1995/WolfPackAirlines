package com.example.wolfpackairlines;

public class Customer {

    private String Name;
    private String flight;
    private String Email;
    private String PhoneNumber;
    private String Gender;
    private String ETA;
    private String DepartTime;
    private double TotalPrice;
    private int BoardingPassNumber;
    private int Age;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getFlight() {
        return flight;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public void setFlight(String flight) {
        this.flight = flight;
    }
    public String getEmail()
    {
        return this.Email;
    }

    public void setEmail(String Email)
    {
        this.Email = Email;
    }

    public String getPhoneNumber()
    {
        return this.PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber)
    {
        this.PhoneNumber = PhoneNumber;
    }

    public String getGender()
    {
        return this.Gender;
    }

    public void setGender(String Gender)
    {
        this.Gender = Gender;
    }

    public String getETA()
    {
        return this.ETA;
    }

    public void setETA(String ETA)
    {
        this.ETA = ETA;
    }

    public String getDepartTime()
    {
        return this.DepartTime;
    }

    public void setDepartTime(String DepartTime)
    {
        this.DepartTime = DepartTime;
    }

    public double getTotalPrice()
    {
        return this.TotalPrice;
    }

    public void setTotalPrice(double TotalPrice)
    {
        this.TotalPrice = TotalPrice;
    }

    public int getBoardingPassNumber()
    {
        return this.BoardingPassNumber;
    }

    public void setBoardingPassNumber(int BoardingPassNumber)
    {
        this.BoardingPassNumber = BoardingPassNumber;
    }

    public int getAge()
    {
        return this.Age;
    }

    public void setAge(int Age)
    {
        this.Age = Age;
    }

    public Customer(String name, String email, String phoneNumber, String gender, String age, String date, String flight, String departTime) {
        this.Name = name;
        this.Email = email;
        this.PhoneNumber = phoneNumber;
        this.Gender = gender;
        this.Age = Integer.parseInt(age);
        this.date = date;
        this.flight = flight;
        this.DepartTime = departTime;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + Name + '\'' +
                ", flight='" + flight + '\'' +
                ", Email='" + Email + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Gender='" + Gender + '\'' +
                ", ETA='" + ETA + '\'' +
                ", DepartTime='" + DepartTime + '\'' +
                ", TotalPrice=" + TotalPrice +
                ", BoardingPassNumber=" + BoardingPassNumber +
                ", Age=" + Age +
                ", date='" + date + '\'' +
                '}';
    }
}
