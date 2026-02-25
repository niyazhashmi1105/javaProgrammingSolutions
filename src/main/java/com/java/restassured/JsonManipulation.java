package com.java.restassured;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonManipulation {

    public static void main(String[] args) {

        String jsonData = """
                 {
                  "orderId": "O1001",
                  "orderDate": "2025-05-10",
                  "customer": {
                    "name": "Bob Johnson",
                    "address": {
                      "street": "123 Maple Street",
                      "city": "Anytown",
                      "state": "CA",
                      "zip": "90210"
                    },
                    "contact": {
                      "email": "bob.j@example.com",
                      "phone": "555-4567"
                    }
                  },
                  "items": [
                    {
                      "productId": "P001",
                      "productName": "Laptop",
                      "quantity": 2,
                      "price": 999.99
                    },
                    {
                      "productId": "P003",
                      "productName": "Keyboard",
                      "quantity": 1,
                      "price": 75.50
                    }
                  ],
                  "associatedProblems": [
                    {
                      "problemName": "Diabetes",
                      "medications": [
                        {
                          "medicationName": "Aspirin",
                          "dose": "500 mg"
                        },
                        {
                          "medicationName": "Metformin",
                          "dose": "850 mg"
                        }
                      ]
                    }
                  ],
                  "status": "pending"
                }
                """;
        JSONObject jsonObject = new JSONObject(jsonData);
        //System.out.println(jsonObject.toString(2));

        JSONArray itemsArray = jsonObject.getJSONArray("items");
//        System.out.println(itemsArray.getJSONObject(0).toString(2));
//        itemsArray.getJSONObject(0).put("productName","Desktop");
//        System.out.println(itemsArray.getJSONObject(0).toString(2));

        for(int index = 0; index < itemsArray.length(); index++){
            JSONObject item = itemsArray.getJSONObject(index);
            if(item.getString("productName").equals("Laptop")){
                item.put("productName","Desktop");
            }
        }

        System.out.println(jsonObject.toString(2));
    }
}
