package com.addressbooksystem;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to address book problem");
        
        Contacts contact = new Contacts("Ram", "Sharma", "Line No-3", "solapur", "maharashtra", 413101, 8767493484L, "abc@gmail.com");
        System.out.println(contact.toString());
    }
}
