package com.itu.shareonwheels.dto;

/**
 * Created by ramya on 9/28/15.
 */

// only data that is required during registration. It is a subset of user Entity.
public class UserSignUpDto {

    /*
    {
    "firstName":"Ramya",
    "lastName":"Prakash",
    "email":"abc@xyz.com"
    "phone":"123456789"
    }
     */
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
