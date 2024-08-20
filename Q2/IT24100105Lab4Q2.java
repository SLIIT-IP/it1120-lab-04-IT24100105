import java.util.Scanner;

public class IT24100105Lab4Q2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

    // Input and validate exam marks
    System.out.print("Enter exam marks (out of 100): ");

    double examMarks = scanner.nextDouble();
    while (examMarks < 0 || examMarks > 100) {
        System.out.print("Invalid input. Enter exam marks (0-100):");
        examMarks = scanner.nextDouble();
    }

    // Input and validate lab submission marks
    System.out.print("Enter lab submission marks (out of 100):");
     double labMarks = scanner.nextDouble();
     while (labMarks < 0 || labMarks > 100) {
         System.out.print("Invalid input. Enter lab submission marks (0-100):");
         labMarks = scanner.nextDouble(); 
     }

    // Input and validate percentages
    System.out.print("Enter percentage taken from exam marks: ");
        double examPercentage = scanner.nextDouble();
        System.out.print("Enter percentage taken from lab submission marks: ");
        double labPercentage = scanner.nextDouble();
        while (examPercentage + labPercentage != 100) {
            System.out.println("Invalid input. Percentages must add up to 100.");
            System.out.print("Enter percentage taken from exam marks: ");
            examPercentage = scanner.nextDouble();
            System.out.print("Enter percentage taken from lab submission marks: ");
            labPercentage = scanner.nextDouble();
        }
        
        // Calculate final marks
        double finalMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
        System.out.println("Final marks: " + finalMarks);

    }
}