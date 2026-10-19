public class Demo2 {
    public static void main(String[] args) {

        //Now we create a Test class Object 
        Test test = new Test();

        Thread t1 = new Thread(() -> test.show());
        Thread t2 = new Thread(() -> test.show());

        t1.start();
        t2.start();
    }
}

//now we create a thread class
class Test {
     synchronized void show() {
        System.out.println(Thread.currentThread().getName() +"Inside Show");

        try {
            Thread.sleep(2000);
            
        } catch(Exception e) {}
        System.out.println(Thread.currentThread().getName() +"Outside Show");
    }
}
