import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        List<String> studentNames = new ArrayList<>();
        List<Double> studentGrades = new ArrayList<>();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.next();
            studentNames.add(name);

            System.out.print("Enter the grade of student " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            studentGrades.add(grade);
        }

        double average = calculateAverage(studentGrades);

        System.out.println("\nStudent Grade Report:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(studentNames.get(i) + ": " + studentGrades.get(i));
        }

        System.out.println("\nAverage Grade: " + average);
    }

    private static double calculateAverage(List<Double> grades) {
        double sum = 0.0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}

