package com.jayesh.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);
    Contacts contacts = new Contacts();

    public void addContacts(){

        System.out.println("Enter the First Name:");
        contacts.setFirstName(scanner.next());
        System.out.println("Enter the Last Name:");
        contacts.setLastName(scanner.next());
        System.out.println("Enter the Address:");
        contacts.setAddress(scanner.next());
        System.out.println("Enter the City:");
        contacts.setCity(scanner.next());
        System.out.println("Enter the State:");
        contacts.setState(scanner.next());
        System.out.println("Enter the ZipCode:");
        contacts.setZip(scanner.next());
        System.out.println("Enter the Phone Number:");
        contacts.setPhoneNumber(scanner.next());
        System.out.println("Enter the Email");
        contacts.setEmail(scanner.next());

    }

    void displayContacts(){

        System.out.println("First Name:"+contacts.getFirstName());
        System.out.println("Last Name:"+contacts.getLastName());
        System.out.println("Address:"+contacts.getAddress());
        System.out.println("City:"+contacts.getCity());
        System.out.println("State:"+contacts.getState());
        System.out.println("Zip Code:"+contacts.getZip());
        System.out.println("Phone Number:"+contacts.getPhoneNumber());
        System.out.println("Email:"+contacts.getEmail());
    }
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book System");
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.addContacts();
        addressBookMain.displayContacts();

    }
}
