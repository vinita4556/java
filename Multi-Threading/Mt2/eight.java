/*
Daemon Threads:-  background running threads are called Daemon threads 
stop immediately once main thread is completed
*/


public class eight {
     public static void main(String[] args) {
         Thread t1 = new Thread(() -> {
            while(true) {
             System.out.println("Running..");
            }
          
         });
         t1.setDaemon(true); //do not print running 
         t1.start();

         try {
             Thread.sleep(2000);
         } catch (Exception e) {}

         return ;
     }
    
}
