import java.util.Scanner;

public class Digit {

    public static void main(String args[]) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        a = in.nextInt();

        if ((a / 10) == 0) {
            System.out.println(a + " is one digit");

        } else if ((a / 100) == 0) {
            System.out.println(a + " is two digit");

        } else if ((a / 1000) == 0) {
            System.out.println(a + " is three digit");
        } else {
            System.out.println(a + " is more than 3 digit");
        }
    }

}
