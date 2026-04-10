import java.util.HashSet;
import java.util.Set;

public class Trainconsistmanagementapp {
    public static void main(String[] args) {
        // Create a HashSet to store unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        System.out.println("--- Adding Bogies to the Train ---");

        // Adding unique bogie IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        // Intentional attempt to add duplicate IDs
        System.out.println("Attempting to add duplicate IDs: BG101, BG102...");
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        // Displaying the final set of unique bogie IDs
        System.out.println("\nFinal List of Unique Bogie IDs (HashSet):");
        for (String id : bogieIds) {
            System.out.println("Bogie ID: " + id);
        }

        System.out.println("\nTotal unique bogies tracked: " + bogieIds.size());
    }
}