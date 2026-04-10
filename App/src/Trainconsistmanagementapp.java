import java.util.LinkedHashSet;
import java.util.Set;

public class Trainconsistmanagementapp {
    public static void main(String[] args) {
        // Create a LinkedHashSet to represent the train formation
        // This ensures uniqueness and preserves insertion order
        Set<String> trainFormation = new LinkedHashSet<>();

        System.out.println("--- Train Consist Management System ---");
        System.out.println("Scenario: Preserving Physical Attachment Order with Unique Bogies\n");

        // Attach bogies to the engine
        addBogie(trainFormation, "Engine");
        addBogie(trainFormation, "Sleeper");
        addBogie(trainFormation, "Cargo");
        addBogie(trainFormation, "Guard");

        // Attempt to attach a duplicate bogie intentionally
        System.out.println("\nAttempting to re-attach a 'Sleeper' bogie...");
        addBogie(trainFormation, "Sleeper");

        // Display the final formation order [cite: 1]
        System.out.println("\nFinal Train Formation (Order Maintained):");
        System.out.println(trainFormation);

        // Ordered Iteration [cite: 1]
        System.out.print("Sequence: ");
        for (String bogie : trainFormation) {
            System.out.print(bogie + (bogie.equals("Guard") ? "" : " -> "));
        }
        System.out.println();
    }

    private static void addBogie(Set<String> formation, String bogieName) {
        // The add() method automatically handles deduplication [cite: 1]
        if (formation.add(bogieName)) {
            System.out.println("Successfully attached: " + bogieName);
        } else {
            System.out.println("Error: Bogie '" + bogieName + "' is already attached to the consist.");
        }
    }
}