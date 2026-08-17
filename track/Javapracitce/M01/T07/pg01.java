package track.Javapracitce.M01.T07;

import java.util.Scanner;

public class pg01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int size = scanner.nextInt();
        int[] scores = new int[size];

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < size; i++) {
            scores[i] = scanner.nextInt();
        }
        System.out.print("Reverse scores: ");

        for (int i = size - 1; i >= 0; i--) {
            System.out.print(scores[i] + " ");
        }
    }
}
