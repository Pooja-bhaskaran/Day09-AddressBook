package com.Bridgelabz.Address;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Management");
        Contacts contacts = new Contacts();
        contacts.setFirstName("Pooja");
        contacts.setLastName("Bhaskaran");
        contacts.setAddress("Mettur");
        contacts.setCity("Salem");
        contacts.setState("TN");
        contacts.setZipcode(123456);
        contacts.setPhnNumber(965478123);
        contacts.seteMail("123@abc.com");
        System.out.println(contacts.getFirstName());
        System.out.println(contacts.getLastName());
        System.out.println(contacts.getAddress());
        System.out.println(contacts.getCity());
        System.out.println(contacts.getState());
        System.out.println(contacts.getZipcode());
        System.out.println(contacts.getPhnNumber());
        System.out.println(contacts.geteMail());
    }
}
