package track.M02.T01.ST01.ST07;

import java.util.Scanner;

public class PG4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int size = sc.nextInt();

        int a[] = new int[size];
        System.out.println("Enter Array of elements: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements in reverse order");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }
}
