public class Demo5 {
    public static void main(String[] args) {
        //thread lifecycle
        Thread mainThread = Thread.currentThread();

        // 1.phase :- Thread creation stage
        // Thread class ke andar ek ENUM hota h usko hum State kehte h
        //ENUM se pata lga skte h hum konsi stage pr hai 

        Thread t1 = new Thread(() -> {
            System.out.println("Name of current thread is" + Thread.currentThread().getName()); 
            System.out.println("Main thread State is" + mainThread.getState()); // o/p :- Main thread State is TIMED_WAITING
            
        });
         System.out.println(t1.getState()); // output - NEW

         //2.phase:-Runnable Stage
         t1.start();
        System.out.println(t1.getState()); // print RUNNABLE
        
       // MAIN code 2 sec ke liye hold krega 

       // Stage Time-waiting
        try {
             Thread.sleep(2000);// Exception deri h toh try-catch block  mai likhege
        } catch (Exception e) { }

        System.out.println(t1.getState());  // now print TERMINATED
        
    }
}
