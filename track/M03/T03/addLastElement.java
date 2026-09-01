package track.M03.T03;

public class addLastElement {

    public static int[] addLastElement(int[] arr, int value) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = value;
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println("Before inserting:");
        int[] arr = { 10, 20, 30, 40 };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // int target = arr.length;
        int value = 50;
        int[] newArray = addLastElement(arr, value);
        System.out.println("After inserting");

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

}