package com.brainstrom.data;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private List<Address> addresses;

    // Constructor
    public Employee(int id, String name, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.addresses = addresses;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', addresses=" + addresses + '}';
    }
}
