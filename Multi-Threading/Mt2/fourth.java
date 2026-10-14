/*interrupt()  -> this is not static method
then we write t1.interrupt();

we can gracefully handle -- > you can make a thread unhtil a condition
---> cancelling a long running task
 USed to stop our thread pools 
 sleep(),join(),TIMED_WAITING,WAITING---->interrupt() --> toh humko exception milegi InterruptedException

 */
public class fourth {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            //this condition is external
          while(!Thread.currentThread().isInterrupted()){
             System.out.println("Running");// output mai running print nhi hoga
          }
           /*while(true){
                System.out.println("Running");
            }*/
           
        });
      t1.start();
      Thread.sleep(2000);
      t1.interrupt(); // running loop nhi rukega isse bhi

        
    }
}
