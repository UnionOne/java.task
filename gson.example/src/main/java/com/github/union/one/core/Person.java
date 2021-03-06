package com.github.union.one.core;

/**
 * Created by Vaas on 18.11.2015.
 */
public class Person {
    private String number;
    private String name;
    private String address;

    public Person(String number, String name, String address) {
        this.number = number;
        this.name = name;
        this.address = address;
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
