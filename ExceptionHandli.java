public class ExceptionHandli {
    public static void main(String[] args) {

      //JVM - Top to bottom execution of code. If any exception occurs, JVM will terminate the program and print the exception message and stack trace to the console. The stack trace is a list of method calls that the program was in the middle of when an exception was thrown. It is printed to the console when an exception is thrown and can be used to help debug the program.
         try {
          System.out.println(5/0); // this will throw ArithmeticException because we cannot divide a number by zero
          
           /* String s = null;
            s.length();*/ 
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by zero is not allowed. ");
        }
        //Multiple catch blocks - we can have multiple catch blocks to handle different types of exceptions. The catch blocks are checked in the order they are written. The first catch block that matches the type of exception thrown will be executed.
        catch (NullPointerException e) {
            System.out.println("Null pointer exception is not allowed. ");
            //output: Null pointer exception is not allowed.
            //EK BAAR MAI EK HI CATCH BLOCK EXECUTE HOGA 
    }
  }
}






   // Exception Handling in chain of method calls
  /*methodA(8,0);
  }
    private static void methodA(int a, int b) {
    methodB(a,b);
  }
   private static void methodB(int a, int b) {
    try{
        System.out.println(a/b); // this will throw ArithmeticException because we cannot divide a number by zero
      }
      catch(ArithmeticException e){
        System.out.println("Division by zero is not allowed. ");
      }
  }
}
      //USING try-catch block to handle exception
     /* try{
        int a = 8;
        int b = 0;
        System.out.println(a/b); // this will throw ArithmeticException because we cannot divide a number
      }
      catch(ArithmeticException e){
        System.out.println("Division by zero is not allowed. ");
      }

  }
}*/
    //STACK TRACE - it is a list of method calls that the program was in the middle of when an exception was thrown. It is printed to the console when an exception is thrown and can be used to help debug the program.
     /*int a = 8;
     int b = 0;

    methodA(a,b);
  }
  private static void methodA(int a, int b) {
    methodB(a,b);
  }
   private static void methodB(int a, int b) {
    System.out.println(a/b); // this will throw ArithmeticException because we cannot divide a number by zero
  }
}*/






     //Why Exception Handling ?
     /*int a= 7;
     int b = 0;
     System.out.println("Step 1");
     System.out.println(a/b); // this will throw ArithmeticException because we cannot divide a number by zero
      System.out.println("Step 2   ");*/

     //ERROR - it is a serious problem that a program should not try to handle. It is external to the application and cannot be handled by the application. Example - OutOfMemoryError, StackOverflowError, VirtualMachineError, etc.
    /* main(args); // this will throw StackOverflowError because the method is calling itself recursively without any termination condition */ 


      //EXCEPTION HANDLING
      /*int num = 5/0; // this will throw ArithmeticException because we cannot divide a number by zero
      System.out.println(num); // this line will not be executed because the exception will be thrown before this line is executed   */  
   



      
     
    


