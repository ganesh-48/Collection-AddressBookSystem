package com.addressbooksystem;

/*
*@Description - To create a contacts in address book with first name, last name, address, city, state, zip,mobile number.
*Add new contact in address book
 */

import java.util.Scanner;

public class AddressBook {

    Contacts contacts;

    public void addNewContact() {
        String firstName,lastName,address,city,state,email;
        int zip;
        long mobileNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        firstName = scanner.nextLine();
        System.out.println("Enter the last name :");
        lastName = scanner.nextLine();
        System.out.println("Enter the address :");
        address = scanner.nextLine();
        System.out.println("Enter the city :");
        city = scanner.nextLine();
        System.out.println("Enter the state :");
        state = scanner.nextLine();
        System.out.println("Enter the email :");
        email = scanner.nextLine();
        System.out.println("Enter the zip :");
        zip = scanner.nextInt();
        System.out.println("Enter the mobile number :");
        mobileNumber = scanner.nextLong();

        contacts = new Contacts(firstName, lastName, address, city, state, zip, mobileNumber, email);
        System.out.println("contact added");
    }

    //print contact details
    public String toString() {
        return contacts.toString();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to address book problem");

        AddressBook addressBook = new AddressBook();
        addressBook.addNewContact();
        System.out.println(addressBook.toString());
    }
}
