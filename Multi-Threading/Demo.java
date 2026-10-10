//FIRST way of Creating Thread by extending Thread class

public class Demo {
    public static void main(String[] args) {
        //By Default main thread is created by JVM always
        //Threads
        MyThread t1 = new MyThread(); // reference variable is t1
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

/*
Behind the Scene 
t1.start()[thread create operating systen hi kr payega]  ---> JVM asks OS to create a new thread
------> Thread gets Stack /pc space
Thread execute run method 


Thread ko execute CPU krega
 */