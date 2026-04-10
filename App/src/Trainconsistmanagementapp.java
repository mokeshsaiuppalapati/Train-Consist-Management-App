import java.util.LinkedList;

public class Trainconsistmanagementapp {
    public static void main(String[] args) {
        // Create a LinkedList to store the train consist (Bogie IDs)
        LinkedList<String> trainConsist = new LinkedList<>();

        // 1. Adding bogies to the train
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // 2. Inserting a Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        // 3. Removing the first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // 4. Displaying the final ordered train consist
        System.out.println("Final Ordered Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}