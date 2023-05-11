import java.util.Scanner;

public class Input {
    public static void main(String args[]) {
        int a, b, c;
        String s;
        Scanner din = new Scanner(System.in);

        System.out.println("enter value of a");
        a = din.nextInt();
        System.out.println("enter value of b");
        b = din.nextInt();
        c = a + b;
        System.out.println("output=" + c);
        System.out.println("enter name");

        s = din.nextLine();
        System.out.println("output=" + s);

    }
}