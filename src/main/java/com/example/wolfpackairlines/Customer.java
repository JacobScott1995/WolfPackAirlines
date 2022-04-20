package com.example.wolfpackairlines;

public class Customer {

    private String First_Name;
    private String Last_Name;

    private String flight;
    private String Email;
    private String PhoneNumber;
    private String Gender;
    private String ETA;
    private String DepartTime;
    private double TotalPrice;
    private int BoardingPassNumber;
    private int Age;


    public String getFirst_Name()
    {
        return this.First_Name;
    }

    public void setFirst_Name(String First_Name)
    {
        this.First_Name = First_Name;
    }

    public String getLast_Name()
    {
        return this.Last_Name;
    }

    public void setLast_Name(String Last_Name)
    {
        this.Last_Name = Last_Name;
    }

    public String getFlight() {
        return flight;
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

}
