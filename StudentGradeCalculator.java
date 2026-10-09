import java.util.Scanner;

public class StudentGradeCalculator {

    public static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 75) {
            return 'B';
        } else if (percentage >= 60) {
            return 'C';
        } else if (percentage >= 40) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        double subject1 = sc.nextDouble();

        System.out.print("Enter marks in Subject 2: ");
        double subject2 = sc.nextDouble();

        System.out.print("Enter marks in Subject 3: ");
        double subject3 = sc.nextDouble();

        if (subject1 < 0 || subject1 > 100 ||
            subject2 < 0 || subject2 > 100 ||
            subject3 < 0 || subject3 > 100) {
            System.out.println("Invalid marks! Enter marks between 0 and 100.");
            sc.close();
            return;
        }

        double total = subject1 + subject2 + subject3;
        double percentage = total / 3;

        char grade = calculateGrade(percentage);

        System.out.println("\n----- Student Report -----");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total + "/300");
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);

        if (subject1 >= 33 && subject2 >= 33 && subject3 >= 33) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        sc.close();
    }
}