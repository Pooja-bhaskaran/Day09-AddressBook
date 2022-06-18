package com.Bridgelabz.Address;

import javax.lang.model.element.Name;

public class Contacts {
    private static String name;
    private String address;
    private String city;
    private String state;
    private int zipcode;
    private int phnNumber;
    private String eMail;

    void contacts(String name,  String address, String city, String state, int zipcode, int phnNumber, String eMail) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phnNumber = phnNumber;
        this.eMail = eMail;
    }

    public static String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getPhnNumber() {
        return phnNumber;
    }

    public void setPhnNumber(int phnNumber) {
        this.phnNumber = phnNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }


    public String toString(){
        return "Contacts{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zipcode + '\'' +
                ", phoneNumber='" + phnNumber + '\'' +
                ", email='" + eMail + '\'' +
                '}';
    }
}