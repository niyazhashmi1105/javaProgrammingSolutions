package com.java.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class EmpRunner {


    public static void main(String[] args) {

        Employee e1 = new Employee(10,"Niyaz", "QA",7500);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(new Employee(11,"Rashid","DEV",10000));
        employeeList.add(new Employee(12,"Shazada","DEV",15000));
        employeeList.add(new Employee(13,"Gaurav","DEVOPS",12500));
        employeeList.add(new Employee(11,"Ashmita","BA",20000));

        //employeeList.forEach(e-> System.out.println(e));

        System.out.println("List of Employees salary greater than 10000");
        List<Employee> result = employeeList.stream().filter(e -> e.getSalary() > 10000).toList();
        System.out.println(result);

        System.out.println("*************************");

        System.out.println("Sort employees on the basis of salary");
        List<Employee> listOfSortedEmployees = employeeList.stream().sorted((el1, el2) -> Double.compare(el1.getSalary(), el2.getSalary())).collect(Collectors.toList());

        System.out.println(listOfSortedEmployees);


        List<Employee> employeeSortingBasedOnName = employeeList.stream().sorted((en1, en2)-> en1.getName().compareTo(en2.getName())).collect(Collectors.toList());
        System.out.println(employeeSortingBasedOnName);
    }

}
