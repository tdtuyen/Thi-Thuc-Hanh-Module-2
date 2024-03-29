package com.company.model;

import java.time.LocalDate;

public class Contact {
    //region PROPERTY
    private String phoneNumber;
    private String group;
    private String name;
    private String gender;
    private String address;
    private LocalDate birthday;
    private String email;
    //endregion

    //region CONSTRUCTOR

    public Contact() {
    }

    public Contact(String phoneNumber, String group, String name, String gender, String address, LocalDate birthday, String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
    }
    //endregion

    //region SETTER AND GETTER

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //endregion

    //region TO_STRING

    @Override
    public String toString() {
        return phoneNumber + ","
                + group + ","
                + name + ","
                + gender + ","
                + address + ","
                + birthday + ","
                + email;
    }
    //endregion
}

