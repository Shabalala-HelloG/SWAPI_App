package presentation;

import com.fasterxml.jackson.core.type.TypeReference;
import model.Model;
import model.Reference;
import service.SwapiService;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Printer {
    public <T extends Model> void printResources(List<List<T>> allList) {
        //this function used pagination to print the data for each resource per page rather then printing everything at one
        int page = 1;
        Scanner scanner = new Scanner(System.in);

        for (List<T> elementList : allList) {

            System.out.println("\nPAGE: " + page + "\n");

            for (T element : elementList) {

                for (Map.Entry<String, Object> detail :
                        element.displayDetails().entrySet()) {

                    Object value = detail.getValue();

                    String stringValue="";
                    if (value instanceof Reference<?> details) {
                        stringValue = displayResourceDetails(details);

                    } else {

                        // Regular value
                        stringValue = value.toString();
                    }



                    if (stringValue.contains("\n")) {
                        System.out.println("   " + detail.getKey() + ":");
                        System.out.println(
                                "      " + stringValue.replace("\n", "\n      ")
                        );
                    } else {
                        System.out.println(
                                "   " + detail.getKey() + ": " + stringValue
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
    private <T extends Model> String displayResourceDetails(Reference<T> details) {
        Object url = details.getUrl();

        TypeReference<T> typeReference = details.getTypeReference();

        SwapiService<T> service = new SwapiService<>();

        if (url instanceof List<?> urls) {

            int cnt = 1;
            StringBuilder str = new StringBuilder();

            for (Object link : urls) {

                if (link instanceof String links) {

                    str.append(cnt)
                            .append(". ")
                            .append(service
                                    .getAResource(links, typeReference)
                                    .displayName())
                            .append("\n");

                    cnt++;
                }
            }

            return str.toString();

        } else if (url instanceof String singleUrl) {
            return service
                    .getAResource(singleUrl, typeReference)
                    .displayName();
        }

        return "";
    }


}
