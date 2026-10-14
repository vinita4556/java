/*  Thread Priority
types odf priority -
1.MAX_PRIORITY =10
2.MIN_PRIORITY = 1
3.NORM_PRIORITY =5 // NORMAL PRIORITY BY DEFAULT SET HOTI H YEH 

depend on OS
-> may respect on priority 
-> may partially respect
 */

public class seven {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
          System.out.println("Custom thread running");
        });
        t1.start();
        //set the priority
        t1.setPriority(10);
        System.out.println(t1.getPriority()); // run noraml priority (by default)
        
    }
}
