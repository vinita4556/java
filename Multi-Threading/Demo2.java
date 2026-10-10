//How to know thread name and id?

public class Demo2 {
    public static void main(String[] args) {
           //deault main class joh run ho rhi h pehle usko print krwa lege
           //thread  ke pass ek static method hota h jisse hum current thread ka reference le skte h
           System.out.println(Thread.currentThread().getName());
           //hume kyu chaiye thread ka naam - kyuki jb bhi production level pr kuch bnate h toh yeh login purpose ke liye
           System.out.println(Thread.currentThread().getId());
           //getName() is a non-static method

           Thread t1 = new Thread(() ->
           System.out.println("Thread name: " + Thread.currentThread().getName()));
           System.out.println("Thread ID: " + Thread.currentThread().getId());
           t1.start();
    }
    
}
