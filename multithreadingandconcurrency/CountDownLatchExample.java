package incubation.multithreadingandconcurrency;

import java.util.concurrent.CountDownLatch;

class Worker extends Thread {
    private CountDownLatch latch;

    Worker(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " finished work");
        latch.countDown();  // Decrement count
    }
}

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);
        new Worker(latch).start();
        new Worker(latch).start();
        new Worker(latch).start();

        latch.await();  // Wait until all workers finish
        System.out.println("All workers finished, proceeding...");
    }
}

