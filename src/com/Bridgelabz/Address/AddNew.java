package com.Bridgelabz.Address;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddNew {
    static Scanner scanner = new Scanner(System.in);

    ArrayList<Contacts> list = new ArrayList<>();

    public void addNewContact() {

        System.out.println("Enter the full name : ");
        String name = scanner.next();
        System.out.println("Enter the email : ");
        String email = scanner.next();
        System.out.println("Enter the address : ");
        String address = scanner.next();
        System.out.println("Enter the city : ");
        String city = scanner.next();
        System.out.println("Enter the State : ");
        String state = scanner.next();
        System.out.println("Enter the zipcode : ");
        String zipcode = scanner.next();
        System.out.println("Enter the phoneNumber : ");
        String phoneNumber = scanner.next();

        Contacts contact = new Contacts();
        System.out.println(list);
        list.add(contact);

    }

    public void editContact(){
        System.out.println("Enter the full name : ");
        String name = scanner.next();

        for (Contacts contact :list) {
            if (contact.getName().equals(name)){

            }
        }
    }

    public void deleteContact() {

        System.out.println("Enter the  name to search and delete: ");
        String name = scanner.next();
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(Contacts.getName())) {
                list.remove(i);
            }
        }
        System.out.println("Contacts after deletion");
        if (list.isEmpty() != true) {
            System.out.println(list);
        } else {
            System.out.println("Contacts deleted");
        }
    }
}
