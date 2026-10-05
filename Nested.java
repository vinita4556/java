public class Nested{
    public static void main(String[] args) {
      //Nested Try-Catch Block - it is a try-catch block inside another try-catch block. It is used to handle exceptions that may occur in the inner try-catch block. If an exception occurs in the inner try-catch block, it will be caught by the outer try-catch block.
      try{
        System.out.println("Outer try block");
        try{
            System.out.println("Inner try block");
            int a = 8;
            int b = 0;
            System.out.println(a/b); // this will throw ArithmeticException because we cannot divide a number by zero
            }
            catch(ArithmeticException e){
            System.out.println("Inner catch block");
            System.out.println("Division by zero is not allowed.");
            }
        }
      
      catch(ArithmeticException e){
     
        System.out.println("Division by zero is not allowed. ");
      }
    }
}