package date_26_4_24;

public class Main {
    public static void main(String[] args) {
        AgeValidator validator = new AgeValidator();
        int ageToValidate = 16; // Example age to test

        try {
            validator.validateAge(ageToValidate);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
            // Optionally, handle or log the exception further
        }
    }
}
