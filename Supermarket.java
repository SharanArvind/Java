import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalBill = 0.0;
        int choice;

        do {
            System.out.println("Supermarket Bill Generator");
            System.out.println("1. CHIPS- 5");
            System.out.println("2. JUICE - 25");
            System.out.println("3. CHOCALATE - 50");
            System.out.println("4. Calculate Total Bill");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    totalBill += 5;
                    System.out.println("CHIPS added to the bill.");
                    break;
                case 2:
                    totalBill += 25;
                    System.out.println("JUICE added to the bill.");
                    break;
                case 3:
                    totalBill += 50;
                    System.out.println("CHOCALATE added to the bill.");
                    break;
                case 4:
                    System.out.println("Total Bill: " + totalBill);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 5);

        scanner.close();
    }
}