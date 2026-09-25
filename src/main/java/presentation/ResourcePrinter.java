package presentation;

import model.Model;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ResourcePrinter {
    public <T extends Model> void printResources(List<List<T>> allList) {
        //this function used pagination to print the data for each resource per page rather then printing everything at one
        int page = 1;
        Scanner scanner = new Scanner(System.in);

        for (List<T> elementList : allList) {

            System.out.println("\nPAGE: " + page + "\n");

            for (T element : elementList) {

                for (Map.Entry<String, String> detail :
                        element.displayDetails().entrySet()) {

                    String value = detail.getValue();

                    if (value.contains("\n")) {
                        System.out.println("   " + detail.getKey() + ":");
                        System.out.println(
                                "      " + value.replace("\n", "\n      ")
                        );
                    } else {
                        System.out.println(
                                "   " + detail.getKey() + ": " + value
                        );
                    }
                }

                System.out.println();
            }


            if (page < allList.size()) {
                // Only show Next if another page exists

                System.out.println("[N] Next");
                System.out.println("[Q] Quit");

                do {

                    String choice = scanner.nextLine().trim().toLowerCase();

                    if (choice.equals("n")) {
                        page++;
                        break;

                    } else if (choice.equals("q")) {
                        return;

                    } else {
                        System.out.println("Invalid choice. Try again.");
                        System.out.println("[N] Next");
                        System.out.println("[Q] Quit");
                    }
                } while (true);

            } else {

                // Last page — only allow quitting
                System.out.println("[Q] Quit");

                do {

                    String choice = scanner.nextLine().trim().toLowerCase();

                    if (choice.equals("q")) {
                        return;

                    } else {
                        System.out.println("Invalid choice. Try again.");
                        System.out.println("[Q] Quit");
                    }
                } while (true);
            }
        }
    }//printResources


    public String getResourceState(List<?> list) {
        return list.isEmpty()
                ? "EMPTY - To fetch resources upon requested"
                : "POPULATED - Currently in use";
    }


}
