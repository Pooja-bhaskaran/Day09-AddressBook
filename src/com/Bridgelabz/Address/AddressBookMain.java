package com.Bridgelabz.Address;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Management");

        AddNew adding = new AddNew();
        adding.addNewContact();

        System.out.println(adding.list);

        System.out.println("Editing contact");
        adding.editContact();

        System.out.println("Deleting contact");
        adding.deleteContact();
    }
}
