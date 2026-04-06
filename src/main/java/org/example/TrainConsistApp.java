import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");
        System.out.println();

        // Initialize an empty list to store bogies
        List<String> trainConsist = new ArrayList<>();

        // Train consist initialized
        System.out.println("Train consist initialized.");

        // Display initial bogie count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Program continues
        System.out.println("System ready for bogie operations...");
    }
}