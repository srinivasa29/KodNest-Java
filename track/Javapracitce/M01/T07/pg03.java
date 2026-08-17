import java.util.Scanner;

public class pg03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();

        int[] planned = new int[days];
        int[] completed = new int[days];

        for (int i = 0; i < planned.length; i++) {
            planned[i] = scanner.nextInt();
        }

        for (int j = 0; j < completed.length; j++) {
            completed[j] = scanner.nextInt();
        }

        int completedCount = 0;

        for (int z = 1; z <= days; z++) {
            if (completed[z - 1] >= planned[z - 1]) {
                System.out.println("Day " + z + ": Completed");
                completedCount++;
            } else {
                System.out.println("Day " + z + ": Not Completed");
            }
        }

        System.out.println("Total Completed Days: " + completedCount);
    }
}