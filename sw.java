import java.util.*;

class sw {
    public static void main(String[] args) {

        int a, b;

        Scanner din = new Scanner(System.in);

        System.out.println("enter value of a");

        a = din.nextInt();

        System.out.println("enter value of b");

        b = din.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + "b = " + b);
    }
}
