package com.java.streams;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter

class Transaction{

    private String date;
    private double amount;


}

public class TransactionSum {

    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(new Transaction("2025-01-01",100.75),
                                                        new Transaction("2025-02-01",200.50),
                                                        new Transaction("2025-01-01",300.50),
                                                        new Transaction("2025-02-01",500.25),
                                                        new Transaction("2025-04-05",600.75));
        Map<String, Double> transMap = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingDouble(Transaction::getAmount)));

        transMap.forEach((date,sum)->System.out.println("Date is: "+ date+" Amount is: "+ sum));


    }
}
