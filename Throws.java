//Use Checked Exception - A checked exception is an exception that is checked at compile time. It is a subclass of the Exception class. It is used to indicate that a method may throw an exception. The compiler checks whether the method that throws a checked exception is called within a try-catch block or not. If it is not called within a try-catch block, the compiler will throw an error.

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
    public static void main(String[] args) throws FileNotFoundException {
        readFile();
        /*try{
            readFile();
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }*/

        // Checked Exception -----> throws keyword is used to declare the checked exception. It is used to indicate that a method may throw an exception. The throws keyword is followed by the exception class that we want to declare. The throws keyword is used in the method signature. It is used to indicate that the method may throw an exception. 
        //IO Exception used
       /*  try{
            FileReader fr = new FileReader("test.txt");
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }*/
    }
    //new method mai shift krte h ise ab
    private static void readFile() throws FileNotFoundException {
        //Independently, we can handle the exception using try-catch block. The try block contains the code that may throw an exception. The catch block contains the code that handles the exception. The catch block is executed only if an exception is thrown in the try block. If no exception is thrown, the catch block is skipped.
         FileReader fr = new FileReader("test.txt");
         
        /*try{
            FileReader fr = new FileReader("test.txt");
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        }*/
    }
}
