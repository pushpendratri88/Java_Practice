package com.brainstrom.data;

public class Address {
    private final int id;
    private final String street;

    // Constructor
    public Address(int id, String street) {
        this.id = id;
        this.street = street;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "Address{id=" + id + ", street='" + street + "'}";
    }
}
