package JOBSHEET9;

import java.util.Scanner;

public class CafeMenuSearchXX {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Predefined menu array
        String[] menu = {"Fried Rice", "Fried Noodles", "Toasted Bread", "Teh Tarik", "Cappuccino", "Chocolate Ice"};

        System.out.println("--- CAFE MENU ITEMS ---");
        for (String item : menu) {
            System.out.println("- " + item);
        }
        System.out.println("-----------------------");
        
        System.out.print("Enter the name of the item to be searched for: ");
        String searchItem = sc.nextLine();
        
        boolean found = false;
        int index = -1;
        
        // Linear Search Algorithm
        for (int i = 0; i < menu.length; i++) {
            // Use equalsIgnoreCase() for flexible searching
            if (menu[i].equalsIgnoreCase(searchItem)) {
                found = true;
                index = i;
                break; 
            }
        }
        
        // Display search results
        if (found) {
            System.out.println("\nItem available!");
            System.out.println(searchItem + " is found at menu index " + index);
        } else {
            System.out.println("\nItem not on the menu.");
        }
        
        sc.close();
    }
}