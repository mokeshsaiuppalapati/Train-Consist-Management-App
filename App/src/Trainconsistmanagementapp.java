import java.util.HashMap;
import java.util.Map;

public class Trainconsistmanagementapp {
    public static void main(String[] args) {
        // Create a HashMap to store bogie names as keys and capacities as values
        // Requirements: HashMap<String, Integer>
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Inserting capacity values for different bogie types using put()
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 56);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Rectangular Goods", 100); // Load capacity example
        bogieCapacityMap.put("Cylindrical Goods", 80);

        System.out.println("--- Train Bogie Capacity Mapping ---");

        // Iterating over the map using entrySet() to display keys and values
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogieName = entry.getKey();
            Integer capacity = entry.getValue();
            System.out.println("Bogie: " + bogieName + " | Capacity: " + capacity);
        }

        System.out.println("------------------------------------");
        System.out.println("Bogie-capacity mapping completed successfully.");
    }
}