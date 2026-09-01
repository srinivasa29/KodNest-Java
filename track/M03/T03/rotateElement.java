package track.M03.T03;
//Here what  i understood is whenver i need to do anticlockwise then first i need to store tht element in one variable then print all elements then store the variable in last index  thats it.

public class rotateElement {

    public static void main(String[] args) {
        int arr[] = { 12, 23, 34, 45 };
        System.out.println("Before anticlockwise rotation");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("After anticlockwise rotation");
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = res;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
