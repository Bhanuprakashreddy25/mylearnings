import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner; 

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        \\Input the number of people
        System.out.print("Enter the number of people: ");
        int n = scanner.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("The number of people must be greater than zero.");
            return;
        }

        // Initialize the list of people with names
        List<String> people = new ArrayList<>();
        System.out.println("Enter the names of the participants:");
        scanner.nextLine(); // Consume the leftover newline character
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name for person " + i + ": ");
            String name = scanner.nextLine();
            people.add(name);
        }

        // Randomly eliminate people until only one remains
        Random random = new Random();
        while (people.size() > 1) {
            int indexToRemove = random.nextInt(people.size());
            System.out.println("Eliminating: " + people.get(indexToRemove));
            people.remove(indexToRemove);
            System.out.println("Remaining people: " + people);
        }

        // The winner is the last remaining person
        System.out.println("The winner is: " + people.get(0));
    }
}