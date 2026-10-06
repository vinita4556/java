public class Custom {

    public static void main(String[] args) {
        checkEligibility(-5);
    }

    private static void checkEligibility(int age) {

        try {
            if (age <= 0) {
                throw new InvalidAgeException(
                    "Age cannot be negative or zero"
                );
            }

            if (age < 18) {
                throw new InvalidAgeException(
                    "You must be at least 18 years old to vote"
                );
            }

            System.out.println("You are eligible to vote");

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Custom exception class
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}