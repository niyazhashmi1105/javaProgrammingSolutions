package com.java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeNameComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(3, "Charlie"));
        list.add(new Employee(1, "Alice"));
        list.add(new Employee(2, "Bob"));

        Collections.sort(list, new EmployeeNameComparator());

        for (Employee e : list) {
            System.out.println(e.name);
        }
    }
}
