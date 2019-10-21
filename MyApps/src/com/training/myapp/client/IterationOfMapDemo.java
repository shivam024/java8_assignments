package com.training.myapp.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IterationOfMapDemo {


public static void main(String[] args) {
	Map<Integer, String> watches=new HashMap<>();
	watches.put(1, "Apple");
	watches.put(2, "Rolex");
	watches.put(3, "Mi");
	System.out.println(watches);
	// using keySet() for iteration over keys 
//    for (Integer watchNumber : watches.keySet())  
//        System.out.println("key: " + watchNumber); 
//   
//      
//    // using values() for iteration over keys 
//    for (String watchName : watches.values())  
//        System.out.println("value: " + watchName);
    StringBuilder str=new StringBuilder();
    for(Map.Entry<Integer, String> keyvalue :watches.entrySet()) {
    	str.append(keyvalue.getKey());
    	str.append(keyvalue.getValue());
    	    	
    }
    System.out.println(str.toString());
    //System.out.println(str.length());
    
    
    
}}