package track.M02.T01.ST01.ST07;

import java.util.Scanner;

public class PG3 {
    public static void main(String [] args){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Size of Array : ");

          int size=sc.nextInt();
          int a[] =new int[size];
          System.out.println("Enter Array Elements : ");

          for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
          }
          for(int i=0;i<size;i++){
            System.out.println("Elements are : " + a[i]);
          }
           
    }
}
