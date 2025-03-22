import java.util.Scanner;

public class AttendanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total working days in a month
        System.out.print("Enter total working days in the month: ");
        int totalWorkingDays = scanner.nextInt();

        // Input total present days
        System.out.print("Enter number of days present: ");
        int presentDays = scanner.nextInt();

        // Calculate attendance percentage
        double attendancePercentage = ((double) presentDays / totalWorkingDays) * 100;

        // Display result
        System.out.println("Monthly Attendance: " + attendancePercentage + "%");

        // Check if attendance is below requirement
        if (attendancePercentage < 75) {
            System.out.println("⚠ Warning: Low Attendance! Below 75%");
        } else {
            System.out.println("✅ Attendance is satisfactory.");
        }

        scanner.close();
    }
}
