package com.java.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {

        String input = "Please contact us at support@test.com, admin123@gmail.in or sales-team@company.org for more info.";

        List<String> emails = new ArrayList<>();

        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z]+\\.[A-Za-z]{2,}");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            emails.add(matcher.group());
        }
        System.out.println(emails);
    }
}
