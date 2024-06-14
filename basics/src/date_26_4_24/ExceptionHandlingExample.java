package date_26_4_24;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int numerator = 20;
        int denominator = 0; // Attempt to divide by zero

        try {
            // Try to divide numerator by denominator
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Catch the ArithmeticException that occurs if denominator is zero
            System.out.println("Error: Division by zero");
        } finally {
            // Finally block executes regardless of whether exception occurs or not
            System.out.println("Finally block executed");
        }
    }
}
