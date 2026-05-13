package com.java.interview;

public class StringImmutable {
    public static void main(String[] args) {


        String s1 = "Hello";
        System.out.println("--- Proof 1: hashCode ---");
        System.out.println("Before: " + s1.hashCode());   // same
        s1.concat(" World");   // tries to "modify" s1
        System.out.println("After:  " + s1.hashCode());   // still same!
        System.out.println("s1 is still: " + s1);         // still "Hello"


        System.out.println("\n--- Proof 2: Object Reference ---");
        String s2 = "Java";
        String s3 = s2.concat(" Programming");
        System.out.println("s2: " + s2);   // Java        → unchanged
        System.out.println("s3: " + s3);   // Java Programming → new object
        System.out.println("Same object? " + (s2 == s3));  // false


        System.out.println("\n--- Proof 3: String Pool ---");
        String s4 = "Hello";
        String s5 = "Hello";
        System.out.println("s4 == s5 (same pool object)? " + (s4 == s5)); // true
        s4 = s4.concat("!");   // s4 now points to a NEW object
        System.out.println("s4: " + s4);   // Hello!
        System.out.println("s5: " + s5);   // Hello → completely unaffected
        System.out.println("s4 == s5 now? " + (s4 == s5)); // false
    }
}