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

   public void displayContacts(){
        if(contacts == null){
            System.out.println("Contacts is not Available");
        }
        else {
            System.out.println("First Name:"+contacts.getFirstName());
            System.out.println("Last Name:"+contacts.getLastName());
            System.out.println("Address:"+contacts.getAddress());
            System.out.println("City:"+contacts.getCity());
            System.out.println("State:"+contacts.getState());
            System.out.println("Zip Code:"+contacts.getZip());
            System.out.println("Phone Number:"+contacts.getPhoneNumber());
            System.out.println("Email:"+contacts.getEmail());
        }
    }

    public void editContacts(){
        System.out.println("Enter the First Name to Edit Contact");
        String fName = scanner.next();
        if(fName.equals(contacts.getFirstName())) {
            System.out.println("Contact Found.");

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

        }else{
            System.out.println("Given Name of Contact is Not Found");
        }
    }

    public void deleteContacts(){
        System.out.println("Enter the First Name to delete the Contact");
        String fName = scanner.next();
                if(fName.equals(contacts.getFirstName())) {
                    System.out.println("Contact is Found.");
                    contacts = null;

                }else {
                    System.out.println("Given Name of Contact is Not Found");
                }

    }
    public static void main(String[] args) {

        System.out.println("Welcome to Address Book System");
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.addContacts();
        addressBookMain.displayContacts();
        addressBookMain.editContacts();
        addressBookMain.displayContacts();
        addressBookMain.deleteContacts();
        addressBookMain.displayContacts();

    }
}
