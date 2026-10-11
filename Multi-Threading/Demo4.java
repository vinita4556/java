public class Demo4 {
    public static void main(String[] args) {
        // 1 to 100 (Even Number)
        Thread t1 = new Thread(() ->{
        //loop
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0 ){
                System.out.println("T1:" +i);
            }
        }
    });
         
        // 1 to 100 (Odd Number)
       Thread t2 = new Thread(() ->{
        //loop
        for(int i = 0; i <= 100; i++){
            if(i % 2 != 0 ){
                System.out.println("T2 : " +i);
            }
        }
    });

    t1.start();
    t2.start();

    }
}
//Execution order -> Non deterministic (order nhi hotra uper niche bhi print ho jayegi yeh)
