package com.brainstrom.data;


import java.util.Objects;

public class Employee1 {
    private int id;
    private String name;
    private long phone;

    // Constructor
    public Employee1(int id, String name, Long phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return id == employee1.id && phone == employee1.phone && Objects.equals(name, employee1.name);
    }

}
