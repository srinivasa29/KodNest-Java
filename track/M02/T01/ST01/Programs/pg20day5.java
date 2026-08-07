import java.util.Scanner;

public class pg20day5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Byte value :");
        byte value = sc.nextByte();
        System.out.println("Byte value is:" + value);

        System.out.println("Enter short value :");
        short value1 = sc.nextShort();
        System.out.println("short value is:" + value1);

        System.out.println("Enter int value :");
        int value2 = sc.nextInt();
        System.out.println("int value is:" + value2);

        System.out.println("Enter long value :");
        long value3 = sc.nextLong();
        System.out.println("long value is:" + value3);

        System.out.println("Enter float value :");
        float value4 = sc.nextFloat();
        System.out.println("float value is:" + value4);

        System.out.println("Enter double value :");
        double value5 = sc.nextDouble();
        System.out.println("double value is:" + value5);

        System.out.println("Enter boolean value :");
        boolean value6 = sc.nextBoolean();
        System.out.println("boolean value is:" + value6);

    }
}