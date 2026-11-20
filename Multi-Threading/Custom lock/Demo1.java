public class Demo1{
    public static void main(String[] args) {
         Bank b1 = new Bank();

         Thread t1 = new Thread(() -> b1.deposit());
         Thread t2 = new Thread(() -> b1.withdraw());

         t1.start();
         t2.start();
    }
}
class Bank{
    Object lock1 = new Object();
    Object lock2 = new Object();

  //   synchronized  void deposit() ese use nhi krte hue hum synchronized block use kre
    void deposit() {
        synchronized(lock1) {
       System.out.println("Deposite logic");
       try {
        Thread.sleep(2000);
           
       } catch (Exception e) {}
     }
     
    }

   synchronized  void withdraw() {
    synchronized(lock2) {
       System.out.println("whithdraw logic");
        try {
        Thread.sleep(2000);
           
       } catch (Exception e) {}
    }
    }
}