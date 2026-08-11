

import java.util.*;

class Student {

    int registrationId;
    String name;
    double attendancePercentage;
}

public class pg2tueob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstId = scanner.nextInt();
        scanner.nextLine();
        String firstName = scanner.nextLine();
        double attendanceFirst = scanner.nextDouble();

        int secondId = scanner.nextInt();
        scanner.nextLine();
        String secondName = scanner.nextLine();
        double attendanceSecond = scanner.nextDouble();

        Student first = new Student();
        first.registrationId = firstId;
        first.name = firstName;
        first.attendancePercentage = attendanceFirst;

        Student second = new Student();
        second.registrationId = secondId;
        second.name = secondName;
        second.attendancePercentage = attendanceSecond;

        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        Student selectedStudent = null;

        if (selectedId == first.registrationId) {
            selectedStudent = first;
        } else if (selectedId == second.registrationId) {
            selectedStudent = second;
        }

        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println(first.registrationId + " - " + first.name + " - " + first.attendancePercentage + "%");
        System.out.println(second.registrationId + " - " + second.name + " - " + second.attendancePercentage + "%");

        scanner.close();
    }
}