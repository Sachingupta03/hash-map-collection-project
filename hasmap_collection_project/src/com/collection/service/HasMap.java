package com.collection.service;

import com.collection.model.Person;

import java.util.HashMap;
import java.util.Map;

public class HashMap {
    public static void main (String[] args) {
        //Create a HashMap to store Person object with Integer as the key (ID)
        Map<Integer,Person>personMap = new HashMap<> ();

            // Add Person object to the HapMap
            personMap.put(1,new Person ("Ram", 30,"Pune"));
            personMap.put (2,new Person ("Rohan",34,  "Surat"));
            personMap.put (3,new Person ("Sohan",24, "kolktta"));

            // print the entire map
        System.out.println ("All Persons in the Map:");
        for (Map.Entry<Integer,Person> entry: personMap.entrySet ()){
            System.out.println ("Key: "+ "Value:"+ entry.getValue ());

            // Retrieve a specific Person using the key (ID)
            System.out.println ("\nPerson with ID2:" + personMap.get (2));
            // Check if a key exist
            String serchID = "";
            //noinspection SuspiciousMethodCalls
            if (personMap.containsKey (serchID)) {
                //noinspection SuspiciousMethodCalls
                System.out.println ("\nPreson with ID " + serchID+ ":"+personMap.get (serchID));

            } else {
                System.out.println ("\nPerson with ID" + serchID+ "not found");

                // Remove a Person from the map
                personMap.remove (1); // Remove the person with ID 1
                System.out.println ("\nAfter removing person with ID 1:");
                for (Map.Entry<Integer,Person> ignored : personMap.entrySet ()){
                    System.out.println ("Key: "+ entry.getKey ()+"Value:"+ entry.getValue ());
                }
            }
        }
    }
}
