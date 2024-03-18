package com.jayesh.addressbook;
import java.util.Scanner;
public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);
    ContactModel contactmodel = new ContactModel();
    public void CreateContact() {

        System.out.println("Enter the First Name:");
        contactmodel.setfName(scanner.next());
        System.out.println("Enter the Last Name:");
        contactmodel.setlName(scanner.next());
        System.out.println("Enter the Address:");
        contactmodel.setAddress(scanner.next());
        System.out.println("Enter the City:");
        contactmodel.setCity(scanner.next());
        System.out.println("Enter the State:");
        contactmodel.setState(scanner.next());
        System.out.println("Enter the Zip Code:");
        contactmodel.setZipCode(scanner.next());
        System.out.println("Enter the Phone No:");
        contactmodel.setPhoneNo(scanner.next());
        System.out.println("Enter the Email id:");
        contactmodel.setEmail(scanner.next());
    }

    public void ShowContact(){
        System.out.println(" "+ contactmodel.toString());
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Manager");
        AddressBookMain addressbookmain = new AddressBookMain();
        addressbookmain.CreateContact();
        addressbookmain.ShowContact();


    }
}
