import java.util.Scanner;

public class TheTriangleNoAbsen {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);

   
        int numInput;

        int i = 0;

        String s = "";

        System.out.print("Input some number: ");
        numInput = input.nextInt();
    
        input.close();

        System.out.println("Input some number: " + numInput);

       
        while (i < numInput) {
        
            s += "*";
            
          
            System.out.println(s);
            
          
            i++;
        }
    }
}