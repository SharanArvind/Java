import java.util.Scanner;

public class Si {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter the time period in years: ");
        double time = input.nextDouble();

        double interest = (principal * rate * time) / 100;

        System.out.println("The simple interest is: " + interest);

        input.close();

    }

}
