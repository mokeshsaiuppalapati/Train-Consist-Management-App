import java.util.ArrayList;

public class Trainconsistmanagementapp {
    public static void main(String[] args) {
        // Create an ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies: Sleeper, AC Chair, First Class
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Print the list after insertion
        System.out.println("Train consist after adding bogies: " + passengerBogies);

        // Remove one bogie (e.g., AC Chair)
        passengerBogies.remove("AC Chair");
        System.out.println("Train consist after removing AC Chair: " + passengerBogies);

        // Use contains() to check if Sleeper exists [cite: 1]
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is not found.");
        }

        // Print final list state [cite: 1]
        System.out.println("Final Train Consist: " + passengerBogies);
    }
}