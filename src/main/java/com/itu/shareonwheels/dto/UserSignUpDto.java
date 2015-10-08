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
    private String email;
    private String phone;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
