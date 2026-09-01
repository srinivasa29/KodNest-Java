package track.M03.T03;

public class particularIndex {
    public static int[] insertElement(int[] arr, int element, int index) {
        int newArray[] = new int[arr.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = arr[i];
            } else if (i == index) {
                newArray[i] = element;
            } else if (i > index) {
                newArray[i] = arr[i-1];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 40, 50 };
        System.out.println("Before inserting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int element = 30;
        int index = 2;
        int finalResult[] = insertElement(arr, element, index);
        System.out.println("After inserting:");
        for (int i = 0; i < finalResult.length; i++) {
            System.out.println(finalResult[i]);
        }

    }
}
