import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class with fields for name and capacity
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

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class Trainconsistmanagementapp {
    public static void main(String[] args) {
        // Step 1 & 2: Create passenger bogie objects and store them in a List
        List<Bogie> bogies = new ArrayList<>();

        // Adding bogies like Sleeper, AC Chair, and First Class
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("Bogies before sorting:");
        bogies.forEach(System.out::println);

        // Step 3: Apply a Comparator to sort by capacity
        // Using Comparator.comparingInt() for custom sorting logic
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Step 4: Display sorted bogies in order [cite: 1]
        System.out.println("\nBogies after sorting by capacity (Ascending):");
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        // Example of sorting in descending order to identify high-capacity bogies first [cite: 1]
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());
        System.out.println("\nBogies after sorting by capacity (Descending):");
        bogies.forEach(System.out::println);
    }
}