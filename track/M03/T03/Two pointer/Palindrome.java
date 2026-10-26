

import java.util.Scanner;
public class Palindrome {
    public static void palindrome(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        boolean res = true;

        while (left < right) {
            if (arr[left] != arr[right]) {
                res = false;
                break;
            }
            left++;
            right--;
        }

        if (res) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        palindrome(arr);
    }
}
