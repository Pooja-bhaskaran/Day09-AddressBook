package com.Bridgelabz.Address;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddNew {
 static Scanner scanner = new Scanner(System.in);

 public void addNewContact(){

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
    }
}
