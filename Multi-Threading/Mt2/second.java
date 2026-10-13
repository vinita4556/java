// 2ND - join method

public class second {
    public static void main(String[] args) throws InterruptedException{
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



