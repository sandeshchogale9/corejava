package incubation.multithreadingandconcurrency;

import java.util.concurrent.*;

class MyCallable implements Callable<String> {
    public String call() throws Exception {
        return "Callable: Task Completed!";
    }
}

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new MyCallable());

        System.out.println(future.get());  // Waits for the result
        executor.shutdown();
    }
}

