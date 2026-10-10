//difference between start and run()methods
/*  | Basis           | `start()`                                                          | `run()`                                              |
| --------------- | ------------------------------------------------------------------ | ---------------------------------------------------- |
| Purpose         | Naya thread start karta hai                                        | Thread ka task define karta hai                      |
| Thread creation | Naya thread start hota hai                                         | Direct call par naya thread create nahi hota         |
| Execution       | JVM naye thread par `run()` execute karti hai                      | Direct call par current thread mein execute hota hai |
| Calling         | Ek thread object par sirf ek baar successfully call kar sakte hain | Normal method ki tarah call kar sakte hain           |
| Multithreading  | Multithreading enable kar sakta hai                                | Direct call se multithreading nahi hoti              |
| JVM involvement | Thread scheduling mein JVM/OS ka role hota hai                     | Direct call mein normal method execution hota hai   */

public class Demo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
              System.out.println("Current thread is" + Thread.currentThread().getName());
        });
     //t1.start();
     t1.run();// main thread pr hi run cll hora hota h

    }
    
}

/* Interviewer ask question

Q.1 Can we call run() directly?
Ans:-Yes. run() ko directly call kar sakte hain, lekin isse naya thread create nahi hota.

Q.2 Can we call start() twice on the same thread object?
Ans:-No. Ek thread ko dobara start karne par IllegalThreadStateException throw hota hai.

Q.3 Which method is used to achieve multithreading?
Ans:-start().
 */
