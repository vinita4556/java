public class Demo5 {
    public static void main(String[] args) {
        //thread lifecycle
        // 1.phase :- Thread creation stage
        // Thread class ke andar ek ENUM hota h usko hum State kehte h
        //ENUM se pata lga skte h hum konsi stage pr hai 

        Thread t1 = new Thread(() -> {
            System.out.println("Name of current thread is" + Thread.currentThread().getName());
        });
        
        System.out.println(t1.getState());
    }
}
