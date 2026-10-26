package M05.Programs;

class Parent {
    int a = 10;
}

class child extends Parent {
    int a = 20;

    void display() {
        System.out.println("Parent a:" + super.a);
        System.out.println("Child a:" + a);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }

}
