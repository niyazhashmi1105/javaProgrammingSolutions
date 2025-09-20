package com.java.streams;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTotalSalary {

    public static void main(String[] args) {

        Employee employee1 = new Employee("test1",10000);
        Employee employee2 = new Employee("test2",15000);
        Employee employee3 = new Employee("test3",15000);
        Employee employee4 = new Employee("test1",20000);

        List<Employee> empList = new ArrayList<>();
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);

        System.out.println(empList.stream().mapToDouble(Employee::getSalary).sum());

        Map<String,Double> uniqueEmpl = empList.stream()
                                                .collect(Collectors.toMap(Employee::getName,Employee::getSalary,(existing, replacement)->existing,
                                                        ()-> new TreeMap<>(Comparator.naturalOrder())));
        System.out.println(uniqueEmpl);
    }
}
