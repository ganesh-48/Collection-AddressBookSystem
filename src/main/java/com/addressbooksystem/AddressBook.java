package com.addressbooksystem;

/*
*@Description - To create a contacts in address book with first name, last name, address, city, state, zip,mobile number.
*Add new contact in address book
* Edit contact using person name in address book
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

    //Edit person name
    public void editContact(String firstName) {
        if(contacts == null) {
            System.out.println("Address book is empty");
        } else {
            if(contacts.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println("Edit the Contact details:");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter first name:");
                contacts.setFirstName(scanner.next());
                System.out.println("Enter last name:");
                contacts.setLastName(scanner.next());
                System.out.println("Enter the address:");
                contacts.setAddress(scanner.next());
                System.out.println("Enter city name:");
                contacts.setCity(scanner.next());
                System.out.println("Enter the state name:");
                contacts.setState(scanner.next());
                System.out.println("Enter the zip code:");
                contacts.setZip(scanner.nextInt());
                System.out.println("Enter the mobile number:");
                contacts.setMobileNumber(scanner.nextLong());
                System.out.println("Enter the email id:");
                contacts.setEmail(scanner.next());

                System.out.println("All contact of person name is updated");
            } else {
                System.out.println("Entered person name is not found in contacts");
            }
        }
    }

    //print contact details
    public String toString() {
        return contacts.toString();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to address book problem");

        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        addressBook.addNewContact();
        System.out.println("Enter the person name who's details want to edit :");
        addressBook.editContact(scanner.next());
        System.out.println(addressBook.toString());
    }
}
