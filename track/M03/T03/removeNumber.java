package track.M03.T03;

public class removeNumber {
    public static int[] removeNumber(int[] arr, int index) {
        int newArray[] = new int[arr.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = arr[i];
            } else if (i == index) {
                newArray[i] = arr[i + 1];
            } else {
                newArray[i] = arr[i + 1];
            }

        }
        return newArray;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println("Before removing");
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int finalResult[] = removeNumber(arr, index);
        System.out.println("After removing");
        for (int i = 0; i < finalResult.length; i++) {
            System.out.println(finalResult[i]);
        }

    }
}
