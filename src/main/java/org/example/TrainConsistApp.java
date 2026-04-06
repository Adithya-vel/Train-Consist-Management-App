package org.example;

import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create HashMap to store bogie and capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        System.out.println("\nAdding bogie capacity details...");

        // Insert bogie-capacity pairs
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 78);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 100);

        System.out.println("\nBogie Capacity Details:");

        // Iterate through map using entrySet
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {

            String bogieName = entry.getKey();
            Integer capacity = entry.getValue();

            System.out.println(bogieName + " -> Capacity: " + capacity);
        }

        System.out.println("\nTotal Bogie Types Tracked: " + bogieCapacity.size());
    }
}