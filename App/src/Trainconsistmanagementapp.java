import java.util.ArrayList;
import java.util.List;

/**
 * ==========================================================
 * MAIN CLASS - TrainConsistManagementApp
 * ==========================================================
 * Use Case 1: Initialize Train and Display Consist Summary
 * * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 * * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic List to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 * * This use case introduces collection initialization and
 * basic program startup flow.
 * * @author Developer
 * @version 1.0
 */
public class Trainconsistmanagementapp {

    public static void main(String[] args) {
        // 1. Application prints welcome message
        System.out.println("=== Train Consist Management App ===");

        // 2. Train consist is initialized using a dynamic List (ArrayList)
        // This will store bogies dynamically as the program grows.
        List<String> trainConsist = new ArrayList<>();

        // 3. Initial bogie count is displayed using size()
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // 4. Print the current state of the train
        System.out.println("Current state: Train is empty. Ready to add bogies.");

        System.out.println("Program continues...");
    }
}