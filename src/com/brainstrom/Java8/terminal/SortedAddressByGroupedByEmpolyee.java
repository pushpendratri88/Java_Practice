package com.brainstrom.Java8.terminal;

import com.brainstrom.data.Address;
import com.brainstrom.data.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class SortedAddressByGroupedByEmpolyee {
    static Consumer<Employee> consumer = (employee) -> System.out.println("Employee "+employee.getId() + "::" + employee.getAddresses());
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(3, "Alice", Arrays.asList(new Address(2, "Second Street"), new Address(1, "First Street"))),
                new Employee(1, "Bob", Arrays.asList(new Address(4, "Fourth Street"), new Address(3, "Third Street"))),
                new Employee(2, "Charlie", Arrays.asList(new Address(6, "Sixth Street"), new Address(5, "Fifth Street")))
        );

        List<Employee> empList = employees.stream().sorted(Comparator.comparingInt(employee -> employee.getId()))
                .map(employee -> new Employee(
                        employee.getId(),
                        employee.getName(),
                        employee.getAddresses()
                                .stream()
                                .sorted(Comparator.comparingInt(address -> address.getId()))
                                .collect(Collectors.toList())
                )).collect(Collectors.toList());

        empList.forEach(consumer);
    }


}
