package org.example;

import java.util.ArrayList;
import java.util.List;

// Bogie class representing each coach
class Bogie {
    String bogieId;
    String type;
    int seatCapacity;

    // Constructor
    public Bogie(String bogieId, String type, int seatCapacity) {
        this.bogieId = bogieId;
        this.type = type;
        this.seatCapacity = seatCapacity;
    }

    // Display bogie details
    public void displayBogie() {
        System.out.println("Bogie ID: " + bogieId +
                " | Type: " + type +
                " | Seat Capacity: " + seatCapacity);
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Train consist list
        List<Bogie> trainConsist = new ArrayList<>();

        System.out.println("Train consist initialized.");

        // Adding passenger bogies
        Bogie b1 = new Bogie("P101", "Sleeper", 72);
        Bogie b2 = new Bogie("P102", "AC Chair", 60);
        Bogie b3 = new Bogie("P103", "First Class", 40);

        trainConsist.add(b1);
        trainConsist.add(b2);
        trainConsist.add(b3);

        System.out.println("\nPassenger bogies added successfully.");

        // Display consist
        System.out.println("\nCurrent Train Consist:");

        for (Bogie b : trainConsist) {
            b.displayBogie();
        }

        // Display total bogie count
        System.out.println("\nTotal Bogies: " + trainConsist.size());
    }
}