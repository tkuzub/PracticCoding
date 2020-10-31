package com.practic.codewars.oop;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> input;

    public Dictionary(){
      input = new HashMap<>();
    }

    public void newEntry(String key, String value){
        input.put(key, value);
    }

    public String look(String key){
        return input.getOrDefault(key, "Cant find entry for " + key);
    }
}
