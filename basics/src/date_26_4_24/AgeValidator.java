package date_26_4_24;

class AgeValidator {
    // Method to validate age and throw custom exception if age < 18
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}
