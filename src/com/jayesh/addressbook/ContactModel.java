package com.jayesh.addressbook;

public class ContactModel {
    private String fName;
    private String lName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNo;
    private String email;

    public void setfName(String fName){
        this.fName = fName;
    }
    public void setlName(String lName){
        this.lName = lName;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactModel{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}