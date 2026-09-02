public class MoveAllZeroesToEnd {
    public static void movezeroes(int arr[]) {
        int newArr[] = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[count] = arr[i];
                count++;
            }
        }
        while (count < arr.length) {
            newArr[count] = 0;
            count++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 0, 10, 0, 50, 0 };
        System.out.println("Before traversing");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        movezeroes(arr);
        System.out.println("After traversing");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}