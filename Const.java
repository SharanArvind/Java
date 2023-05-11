import java.util.*;

class ad {
    int a, b, c;

    ad() {
        a = 10;
        b = 20;
        c = a + b;
    }

    void display() {
        System.out.println("output" + c);
    }

}

public class Const {
    public static void main(String args[]) {
        ad a1 = new ad();
        a1.display();
    }
}
