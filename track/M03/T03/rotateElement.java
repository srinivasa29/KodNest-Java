package track.M03.T03;
//Here what  i understood is whenver i need to do anticlockwise then first i need to store tht element in one variable then print all elements then store the variable in last index  thats it.

public class rotateElement {

    public static void main(String[] args) {
        int arr[] = { 12, 23, 34, 45 };
        System.out.println("Before clockwise rotation");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("After clockwise rotation");
        int res = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = res;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
