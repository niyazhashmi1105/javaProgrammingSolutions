package com.java.interview;

import com.google.gson.Gson;

public class Runner {

    public static void main(String[] args) {
        UserSerialization user = new UserSerialization("niyaz",39);
        //System.out.println(user);

        //Serialization - Java Object to Json Object
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);

        //Deserialization - Json Object to Java Object
        String jsonData = "{\"name\":\"niyaz\",\"age\":39}";
        UserSerialization user2 = gson.fromJson(jsonData,UserSerialization.class);
        System.out.println(user2);

    }
}
