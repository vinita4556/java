/*public class Demo1 {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);
        
        t1.start();
        
    }    
    
}

//create a thread using Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
} */


//Functional Interface
//r1 ka reference variable ki jagah lembda expression use kr skte h
public class Demo1 {
    public static void main(String[] args) {
       // MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(() -> {
            System.out.println("Thread is running...");
        });
        t1.start();   
    }    
    
}
//create a thread using Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
} 
