package com.java.streams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.asm.Advice;

@Getter
@Setter
@AllArgsConstructor

public class Employee {

    private String name;
    private double salary;
}
