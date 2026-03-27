package com.java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.rollNo - s.rollNo; // Natural sorting by rollNo
    }

    public static void main(String[] args) {
            List<Student> list = new ArrayList<>();
            list.add(new Student(3, "A"));
            list.add(new Student(1, "B"));
            list.add(new Student(2, "C"));

            Collections.sort(list);

            for (Student s : list) {
                System.out.println(s.rollNo);
            }
        }

}


