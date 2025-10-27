import java.util.Scanner;

public class DisplayTwoNoAbsen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput;

       
        System.out.print("Input some number: ");
        numInput = input.nextInt();

        
        System.out.print("Input some number: "); 
        System.out.println(numInput); 

      
        for (int i = 2; i <= numInput; i += 2) {
            System.out.print(i + " ");
        }
        
      
        System.out.println("?");


    }
}