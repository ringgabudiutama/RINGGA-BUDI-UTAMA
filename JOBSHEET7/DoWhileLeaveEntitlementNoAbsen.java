import java.util.Scanner;

public class DoWhileLeaveEntitlementNoAbsen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("Input The Number of Leave Entitlement: ");
        leaveEntitlement = input.nextInt();
        input.nextLine();

        do {
            System.out.print("Do you want to take a leave (y/n)? ");
            confirmation = input.nextLine();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)? ");
                numLeave = input.nextInt();
                input.nextLine();

                while (numLeave > leaveEntitlement) {
                    System.out.println("You don’t have enough leave entitlement. Please enter a valid number:");
                    numLeave = input.nextInt();
                    input.nextLine();
                }

                leaveEntitlement -= numLeave;
                System.out.println("Remaining leave entitlement: " + leaveEntitlement);

                if (leaveEntitlement <= 2 && leaveEntitlement > 0) {
                    System.out.println("Warning: Only " + leaveEntitlement + " day(s) remaining!");
                }
            }
        } while (leaveEntitlement > 0 && confirmation.equalsIgnoreCase("y"));

        System.out.println("Leave process finished.");
        input.close();
    }
}
