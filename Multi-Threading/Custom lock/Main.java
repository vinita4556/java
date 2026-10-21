class CustomLock {

    private boolean isLocked = false;

    public synchronized void lock() throws InterruptedException {

        while (isLocked) {
            wait();
        }

        isLocked = true;
    }

    public synchronized void unlock() {

        isLocked = false;
        notify();
    }
}

public class Main {

    public static void main(String[] args) {

        CustomLock lock = new CustomLock();

        Runnable task = () -> {

            try {

                lock.lock();

                System.out.println(
                    Thread.currentThread().getName()
                    + " entered critical section"
                );

                Thread.sleep(2000);

                System.out.println(
                    Thread.currentThread().getName()
                    + " leaving critical section"
                );

                lock.unlock();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}