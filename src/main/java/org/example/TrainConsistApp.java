package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // LinkedHashSet to maintain insertion order and uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        System.out.println("\nAttaching bogies to the train...");

        // Adding bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        trainFormation.add("Sleeper");

        System.out.println("\nFinal Train Formation:");

        // Print bogies in insertion order
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }

        System.out.println("\nTotal Bogies in Train: " + trainFormation.size());
    }
}