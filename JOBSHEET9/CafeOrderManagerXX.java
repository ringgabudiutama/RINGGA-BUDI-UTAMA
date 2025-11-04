package JOBSHEET9;

import java.util.Scanner;

public class CafeOrderManagerXX {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of orders: ");
        int numOrders = sc.nextInt();
        
        String[] itemNames = new String[numOrders];
        double[] itemPrices = new double[numOrders];
        double totalCost = 0;
        
        // Consume newline character left by nextInt()
        sc.nextLine(); 

        // Input data
        for (int i = 0; i < numOrders; i++) {
            System.out.println("\n--- Order " + (i + 1) + " ---");
            System.out.print("Enter the name of the food/drink: ");
            itemNames[i] = sc.nextLine();
            
            System.out.print("Enter the price for " + itemNames[i] + ": ");
            itemPrices[i] = sc.nextDouble();
            
            totalCost += itemPrices[i];
            
            // Consume newline character after nextDouble()
            sc.nextLine(); 
        }

        // Output
        System.out.println("\n--- LIST OF ORDERS ---");
        for (int i = 0; i < numOrders; i++) {
            System.out.printf("%d. %-20s Rp %.2f\n", (i + 1), itemNames[i], itemPrices[i]);
        }
        
        System.out.println("------------------------------------");
        System.out.printf("Total cost of all orders: Rp %.2f\n", totalCost);
        
        sc.close();
    }
}
