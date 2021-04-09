package com.addressbooksystem;

/*
*@Description - To create a contacts in address book with first name, last name, address, city, state, zip,mobile number.
*Add new contact in address book
* Edit contact using person name in address book
* Delete the person using person's name details
* Add multiple person's contact into address book
* Delete all contact from address book
* No duplicate entry of same person in address book
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    //instance variable creating multiple contacts
    String addressBookName;
    ArrayList<Contacts> contactsList = new ArrayList<Contacts>();

    public void addNewContact() {
        String firstName, lastName, address, city, state, email;
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

        Contacts contacts = new Contacts(firstName, lastName, address, city, state, zip, mobileNumber, email);
        System.out.println("contact added");
        contactsList.add(contacts);
    }

    //checking the duplicate entry of same person in address book
    public boolean duplicateEntryCheck(String firstName) {
        for (Contacts contacts : contactsList) {
            boolean existAlready = contacts.equals(firstName);
            if (existAlready == true)
                return true;
        }
        return false;
    }

    //Edit person name
    public void editContact(String firstName) {
        if (contactsList.isEmpty()) {
            System.out.println("Address book is empty");
        } else {
            int p = contactsList.size();
            int i;
            for (i = 0; i < contactsList.size(); i++) {
                if (contactsList.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                    System.out.println("you want edit details");
                    System.out.println("Enter 1 : Edit first name");
                    System.out.println("Enter 2 : Edit last name ");
                    System.out.println("Enter 3 : Edit address ");
                    System.out.println("Enter 4 : Edit city name ");
                    System.out.println("Enter 5 : Edit state name ");
                    System.out.println("Enter 6 : Edit zip code ");
                    System.out.println("Enter 7 : Edit mobile number ");
                    System.out.println("Enter 8 : Edit email ID");
                    System.out.println("Enter your choice");
                    Scanner scanner = new Scanner(System.in);
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter first name : ");
                            contactsList.get(i).setFirstName(scanner.next());
                            System.out.println("contact updated");
                            break;

                        case 2:
                            System.out.println("Enter your last name : ");
                            contactsList.get(i).setLastName(scanner.next());
                            System.out.println("contact updated");
                            break;

                        case 3:
                            System.out.println("Enter your address : ");
                            contactsList.get(i).setAddress(scanner.next());
                            System.out.println("contact updated");
                            break;

                        case 4:
                            System.out.println("Enter your city : ");
                            contactsList.get(i).setCity(scanner.next());
                            System.out.println("contact updated");
                            break;

                        case 5:
                            System.out.println("Enter your state  : ");
                            contactsList.get(i).setState(scanner.next());
                            System.out.println("contact updated");
                            break;

                        case 6:
                            System.out.println("Enter your zip : ");
                            contactsList.get(i).setZip(scanner.nextInt());
                            System.out.println("contact updated");
                            break;

                        case 7:
                            System.out.println("Enter your mobile number : ");
                            contactsList.get(i).setMobileNumber(scanner.nextLong());
                            System.out.println("contact updated");
                            break;

                        case 8:
                            System.out.println("Enter your email Id : ");
                            contactsList.get(i).setEmail(scanner.next());
                            System.out.println("contact updated");
                            break;

                        default:
                            System.out.println("Enter right choice ");
                            break;
                    }
                    break;
                }
            }
            if (p == i) {
                System.out.println("Contact not found");
            }
        }
    }

    //delete the person details using person's name
    public void deleteContact(String firstName) {
        if (contactsList.isEmpty()) {
            System.out.println("Address book is empty");
        } else {
            int p = contactsList.size();
            int i;
            for (i = 0; i < contactsList.size(); i++) {
                if (contactsList.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                    Contacts contact = contactsList.get(i);
                    contact = null;
                    System.out.println("Entered person name Contact is deleted from address book");
                    break;
                }
            }
            if (p == i) {
                System.out.println("Entered contact is not fount address book");
            }
        }
    }

    //print contact details
    public String toString() {
        if (contactsList.isEmpty())
            return "Address book is empty";
        else {
            for (int i = 0; i < contactsList.size(); i++) {
                System.out.println(i + 1 + ". " + contactsList.get(i).toString());
            }
        }
        return "";
    }

    //Delete all the contact from AddressBook
    public void deleteAddressBook() {
        if (!contactsList.isEmpty()) {
            for (int i = 0; i < contactsList.size(); i++) {
                Contacts contact = contactsList.get(i);
                contact = null;
                contactsList.remove(i);
            }
        }
    }

    public void searchPersonByCity(String city) {
        System.out.println("show person by city in " + addressBookName);
        if (!contactsList.isEmpty()) {
            for (int i = 0; i < contactsList.size(); i++) {
                Contacts contact = contactsList.get(i);
                if (contact.getCity() == city) {
                    System.out.println(i + 1 + "." + contact.getFirstName().toString());
                }
            }
        }
    }

    public void searchPersonByState(String state) {
        System.out.println("show person by city in " + addressBookName);
        if (!contactsList.isEmpty()) {
            for (int i = 0; i < contactsList.size(); i++) {
                Contacts contact = contactsList.get(i);
                if (contact.getState() == state) {
                    System.out.println(i + 1 + "." + contact.getFirstName().toString());
                }
            }
        }
    }
}
