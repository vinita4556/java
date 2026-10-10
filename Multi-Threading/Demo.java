public class Demo {
    public static void main(String[] args) {
        //Threads
        MyThread t1 = new MyThread();
        t1.start();
    }
}
//Thread class extends
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}