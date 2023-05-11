import java.util.Scanner;
import java.util.*;

class Odd {
    public static void main(String args[]) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        a = in.nextInt();
        if ((a % 2) == 0) {
            System.out.println(a + "even");

        } else {
            System.out.println(a + "odd");
        }

    }
}
