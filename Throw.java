public class Throw {
    public static void main(String[] args) {
        //Throwing an exception - we can throw an exception using the throw keyword. The throw keyword is used to throw an exception explicitly. It is used to throw an exception when a certain condition is met. The throw keyword is followed by an instance of the exception class that we want to throw.
        //Now handle the exception using try-catch block. The try block contains the code that may throw an exception. The catch block contains the code that handles the exception. The catch block is executed only if an exception is thrown in the try block. If no exception is thrown, the catch block is skipped.
        try {
            checkEligibility(-5 );
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    private static void checkEligibility(int age ) {
       if(age <= 0){
        throw new IllegalArgumentException("Age cannot be negative or zero");
       }

       if(age > 18){
        throw new IllegalArgumentException("You must be at least 18 years old to vote");
       }
    }
    
} 
