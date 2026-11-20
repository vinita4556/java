

public class Demo {
    public static void main(String[] args) {
        //create a box object
        Box box = new Box();

        //create a producer thread
        Thread t1 = new Thread(() -> {
            //create a loop to produce values
            for (int i = 1; i < 20; i++) {
                try {
                    Thread.sleep(100); // Sleep for 1 second before producing the next item
                } catch (Exception e) {}
               box.producer(i);
            }
        });

       /*1:-Thread t1 = new Thread(() -> box.producer(10));*/
        //create a consumer thread
        /*2:-Thread t2 = new Thread(() -> box.consumer(10));*/
        Thread t2 = new Thread(() -> {
            //create a loop to consume values
            for (int i = 1; i < 20; i++) {
                try {
                    Thread.sleep(70); // Sleep for 1 second before consuming the next item
                } catch (Exception e) {} 
                box.consumer(i);
            }
        });

        //start both threads
        t1.start();
        t2.start();


        
    }
}

//create a class
class Box {
   Integer item;
   Boolean flag = false; // flag tells value is available or not
//Create a function to put value in box
   void producer(int value) {
    item = value;
    flag = true;
    System.out.println("Producer produces " + item);
   }

   void consumer(int value) {
    System.out.println("Consumer consumes " + item);
    item = null;
    flag = false;
   }

}
    

