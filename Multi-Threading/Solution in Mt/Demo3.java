public class Demo3 {
    public static void main(String[] args) {
         //create class object
        Vinita vinita = new Vinita();
        
        Thread  t1 = new Thread(() -> vinita.v1());
        Thread  t2 = new Thread(() -> vinita.v2());

        t1.start();
        t2.start();
    }
}
class Vinita {
        synchronized void v1() {
             System.out.println("v1 entered");

            try {
                //sleep method
                Thread.sleep(2000);
                
            } catch(Exception e) {}
        System.out.println("v1 exit");
    }
         synchronized void v2() {
              System.out.println("v2 entered");
             try {
                //sleep method
                Thread.sleep(2000);
                
            } catch(Exception e) {}
              System.out.println("v2 exit");
      
    }
}
