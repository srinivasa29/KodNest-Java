import java.util.Scanner;

class Learner {

    int id;
    String name;
    int javascore;
}

public class pg3tue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstLearnerId = scanner.nextInt();
        scanner.nextLine();
        String firstName = scanner.nextLine();
        int firstJavaScore = scanner.nextInt();

        int secondLearnerId = scanner.nextInt();
        scanner.nextLine();
        String secondName = scanner.nextLine();
        int secondJavaScore = scanner.nextInt();

        Learner first = new Learner();
        first.id = firstLearnerId;
        first.name = firstName;
        first.javascore = firstJavaScore;

        Learner second = new Learner();
        second.id = secondLearnerId;
        second.name = secondName;
        second.javascore = secondJavaScore;

        int newScore = scanner.nextInt();

        System.out.println("Before Update");
        System.out.println(first.id + " - " + first.name + " - " + first.javascore);
        System.out.println(second.id + " - " + second.name + " - " + second.javascore);

        
        first.javascore = newScore;

    
        System.out.println("After Update");
        System.out.println(first.id + " - " + first.name + " - " + first.javascore);
        System.out.println(second.id + " - " + second.name + " - " + second.javascore);

        scanner.close();
    }
}