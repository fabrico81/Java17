package section10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        withIfCaseStatement();
    }


    public static void withSwitchStatement() {

        List<String> grocery = new ArrayList<>();
        boolean flag = true;

        while (flag) {
            printInstructions();
            switch (scanner.nextInt()) {
                case 1 -> addItems(grocery);
                case 2 -> removeItems(grocery);
                default -> flag = false;
            }
        }
    }

    private static void removeItems(List<String> grocery) {
        System.out.println("Enter items to remove to the list (comma delimited):");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            if (grocery.indexOf(trimmed) < 0) {
                grocery.add(trimmed);
            }
        }
    }

    private static void addItems(List<String> grocery) {
        System.out.println("Enter items to add to the list (comma delimited):");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            grocery.remove(trimmed);

        }
    }

    private static void withIfCaseStatement() {
        Scanner scanner = new Scanner(System.in);
        List<String> groceryList = new ArrayList<>();
        printInstructions();
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        int choice = scanner.nextInt();
        if (choice == 0) {
            scanner.close();
            return;
        }
        if (choice == 1) {
            System.out.println("Enter items to add to the list (comma delimited):");
            String items = scanner.nextLine();
            String[] itemArray = items.split(",");
            groceryList.addAll(List.of(itemArray));
            System.out.println(groceryList);
        } else if (choice == 2) {
            System.out.println("Enter items to remove from the list (comma delimited):");
            scanner.nextLine();
            String items = scanner.nextLine();
            String[] itemArray = items.split(",");
            for (String item : itemArray) {
                groceryList.remove(item);
            }
            System.out.println(groceryList);
        } else if (choice == 3) {
            System.out.println("Enter item to search for:");
            scanner.nextLine();
            String item = scanner.nextLine();
            if (groceryList.contains(item)) {
                System.out.println("Found " + item + " in the list");
            } else {
                System.out.println(item + " not found in the list");
            }
        } else {
            System.out.println("Invalid choice");
        }
    }

    public static void printInstructions() {
        String textBlock = """
                 0 - to quit
                 1 - to add item(s) to the list (comme delimited) 
                 2 - to remove any items (comma delimited list)
                 3 - to search for an item in the list
                """;
        System.out.println(textBlock + " ");

    }
}
