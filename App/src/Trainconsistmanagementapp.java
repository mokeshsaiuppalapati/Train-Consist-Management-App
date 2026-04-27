import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class Trainconsistmanagementapp {

    public static void main(String[] args) {

        // Step 1: Create bogie list (reuse UC7 data)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper",72));
        bogies.add(new Bogie("AC Chair",56));
        bogies.add(new Bogie("First Class",24));
        bogies.add(new Bogie("General",90));

        // Display original list
        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        // Step 2: Create stream and filter capacity > 60
        List<Bogie> filteredBogies =
                bogies.stream()
                        .filter(b -> b.getCapacity() > 60)
                        .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("\nBogies with Capacity Greater Than 60:");
        filteredBogies.forEach(System.out::println);
    }
}