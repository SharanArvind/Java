import java.util.Scanner;

import javax.print.DocFlavor.STRING;

class Student {
    String name;
    int id;

    void get() {
        Scanner din = new Scanner(System.in);
        System.out.println("enter the id");
        id = din.nextInt();
        System.out.println("enter the name");
        name = din.next();
    }

    void display() {
        System.out.println(id);
        System.out.println(name);
    }
}

class Class {

    public static void main(String args[]) {
        Student s = new Student();
        s.get();
        s.display();

    }
}
