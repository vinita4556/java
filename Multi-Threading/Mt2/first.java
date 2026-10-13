// thread important methods

/*
Thread.sleep() -> TIMED_WAITING state mai jayegi thread
Internally -> RUNNABLE ->TIMED_WAITING --> RUNNABLE
TIMED_WAITING  kbhi bhi lock release nhi karte

 */

public class first {
    public static void main(String[] args) throws InterruptedException{
        /*//Main thread starts
        System.out.println("Main thread starts");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        System.out.println("Main thread ends");*/

        // 2ND - join method
        /* Main Thread -->WAITING
        t1 Thread ----> RUNNABLE ---> TERMINATED
        Main Thread -----> WAITING --->RUNNABLE---->TERMINATED 
         */
        //Main thread starts
        System.out.println("Main thread starts");
        Thread t1 = new Thread(() -> {
         try {
             Thread.sleep(2000);
         } catch(InterruptedException e) {}
         System.out.println("Thread-0 starts");
        });

        t1.start();

        t1.join(); //let the t1 Thread first complete its execution

        System.out.println("Main thread ends");

    }
}


