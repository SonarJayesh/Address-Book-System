package com.jayesh.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Contacts> contactList = new ArrayList<>();
    public void addContacts() {
        Contacts contacts = new Contacts();
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
        contactList.add(contacts);
    }

    public void displayContacts() {

       if(!contactList.isEmpty()){
           for (int i =0; i<contactList.size();i++){

               Contacts contacts = contactList.get(i);
               System.out.println(contacts.toString());

           }
       }else {
           System.out.println("Contact is Empty");
       }
    }

    public void editContacts() {

        Contacts contacts = checkContactsExist();

        if (contacts != null) {
            System.out.println("Contact is Found.");

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
    }

    public void deleteContacts() {
       Contacts contacts = checkContactsExist();

       if (contacts != null){
           contactList.remove(contacts);
           System.out.println("Contact is Deleted");
       }

    }

    public Contacts checkContactsExist() {

        if (!contactList.isEmpty()) {
            System.out.println("Enter the First Name ");
            String fName = scanner.next();

            boolean found = false;

            Contacts contacts = null;

            for (int i = 0; i < contactList.size(); i++) {
                contacts = contactList.get(i);

                if (fName.equals(contacts.getFirstName())) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Contact is not Available in AddressBook ");
                return null;
            }

            return contacts;

        } else {
            System.out.println("Contact is Empty");
            return  null;
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book System");
        int userChoice;
        AddressBookMain addressBookMain = new AddressBookMain();
            do {
                System.out.println(" 1.Add_Contact \n 2.Edit_Contact \n 3.Delete_Contacts \n 4.Display_Contacts \n 5.Exit");
                System.out.println("Enter the Choice Operation Number");

                userChoice = addressBookMain.scanner.nextInt() ;
                    switch (userChoice) {
                        case 1:
                            addressBookMain.addContacts();
                            break;

                        case 2:
                           addressBookMain.editContacts();
                            break;

                        case 3:
                           addressBookMain.deleteContacts();
                            break;

                        case 4:
                            addressBookMain.displayContacts();
                            break;
                    }
            }while(userChoice<=4);
    }
}
