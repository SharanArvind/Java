import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        int a, b;
        Scanner din = new Scanner(System.in);
        System.out.println("enter value of a");
        a = din.nextInt();
        System.out.println("enter value of b");
        b = din.nextInt();
        int result = (a + b) * (a + b);
        System.out.println(result);

    }

}
