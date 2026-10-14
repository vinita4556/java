/* currentThread() --> reference of current running thread
 */

public class sixth {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        t1.setName("worker-1");
        t1.start(); //output -> Thread-0

    }

    
}
