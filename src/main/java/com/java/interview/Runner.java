package com.java.interview;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class Runner {

    public static void main(String[] args) throws JsonProcessingException {
        UserSerialization user = new UserSerialization("niyaz",39);
        //System.out.println(user);

        //Serialization - Java Object to Json Object
        Gson gson = new Gson();
        String json = gson.toJson(user);
       // System.out.println(json);

        //Deserialization - Json Object to Java Object
        String jsonData = "{\"name\":\"niyaz\",\"age\":39}";
        UserSerialization user2 = gson.fromJson(jsonData,UserSerialization.class);
        //System.out.println(user2);

        //Serialization using Jackson library
        ObjectMapper mapper = new ObjectMapper();
        String user3 = mapper.writeValueAsString(user);
        System.out.println(user3);

        String user4  = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        System.out.println(user4);

        //Deserialization
        String jsonData2 = "{\"name\":\"niyaz\",\"age\":39}";
        UserSerialization user5 = mapper.readValue(jsonData2,UserSerialization.class);
        System.out.println(user5);
    }
}
