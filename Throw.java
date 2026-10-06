public class Throw {
    public static void main(String[] args) {
        //Throwing an exception - we can throw an exception using the throw keyword. The throw keyword is used to throw an exception explicitly. It is used to throw an exception when a certain condition is met. The throw keyword is followed by an instance of the exception class that we want to throw.
        checkEligibility(19);
    }
    private static void checkEligibility(int age ) {
       if(age <= 0){
        System.err.println("Age cannot be zero or negative");
       }

       if(age < 18){
        System.err.println("You must be at least 18 years old to vote");
       }
    }
    
}
