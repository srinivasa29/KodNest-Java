import java.util.Scanner;

public class pg21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Age is " + age);

        System.out.println("Enter you height:");
        float height = sc.nextFloat();
        System.out.println("height is " + height);

        sc.nextLine();
        System.out.println("Enter your Full name:");
        String name = sc.nextLine();
        System.out.println("Full Name is " + name);

    }
}
