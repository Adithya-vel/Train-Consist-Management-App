package org.example;

import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Creating a HashSet to store unique Bogie IDs
        Set<String> bogieIds = new HashSet<>();

        System.out.println("\nAdding bogie IDs to the train consist...");

        // Adding bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG104");
        bogieIds.add("BG102"); // duplicate

        System.out.println("\nUnique Bogie IDs in the Train Consist:");

        // Display the set
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Display total unique bogies
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());
    }
}