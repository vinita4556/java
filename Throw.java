public class Throw {
    public static void main(String[] args) {
        //Throwing an exception - we can throw an exception using the throw keyword. The throw keyword is used to throw an exception explicitly. It is used to throw an exception when a certain condition is met. The throw keyword is followed by an instance of the exception class that we want to throw.
        checkEligibility();
    }
    private static void checkEligibility() {
        int age = 15;
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote"); // throwing an exception explicitly
        } else {
            System.out.println("Eligible to vote");
        }
    }
    
}
