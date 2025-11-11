package JOBSHEET10;
import java.util.Scanner;

public class CinemaWithScanner254107020251{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        String name, next;
        String[][] audience = new String[4][2];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                audience[i][j] = "";
            }
        }

        while (true) {
            System.out.print("Enter a name: ");
            name = sc.nextLine();

            System.out.print("Enter row number: ");
            row = sc.nextInt();
            
            System.out.print("Enter column number: ");
            column = sc.nextInt();
            
            sc.nextLine();

            audience[row - 1][column - 1] = name;

            System.out.print("Are there any other audiences to be added? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
        
        System.out.println("\n--- Audience List ---");
        System.out.println("Row \t Col 1 \t Col 2");
        
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + "\t ");
            for (int j = 0; j < 2; j++) {
                String content = audience[i][j].isEmpty() ? "Empty" : audience[i][j];
                System.out.print(content + "\t ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}