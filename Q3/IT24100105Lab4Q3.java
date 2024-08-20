import java.util.Scanner;

public class IT24100105Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Use ternary operator to determine if the number is positive, negative, or zero
        String result = (number > 0) ? "The number is Positive." :
                        (number < 0) ? "The number is Negative." :
                        "The number is Zero.";
        
        // Display the result
        System.out.println(result);

   }

}