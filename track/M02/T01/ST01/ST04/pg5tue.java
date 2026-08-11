
import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int first, int second) {
        return first + second;
    }
}

public class pg5tue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        MethodDemo m = new MethodDemo();

        int sum = m.add(first, second);
        int lucky = m.getLuckyNumber();

        m.sayHello();
        m.greet(name);

        System.out.println("Lucky Number: " + lucky);
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}
