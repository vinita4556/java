/*interrupt()  -> this is not static method
then we write t1.interrupt();

t1.interrupt();--->
 */
public class fourth {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
           System.out.println("Running");
        });
      t1.start();
      t1.interrupt();
        
    }
}
