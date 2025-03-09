package incubation.multithreadingandconcurrency;

import java.util.concurrent.CompletableFuture;

//Run two tasks asynchronously using CompletableFuture.
//Combine results of both tasks and print the final output.
//Use Case: Asynchronous computation and combining multiple async results.
public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
            return "Hello";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(500); } catch (InterruptedException e) { }
            return "World";
        });

        CompletableFuture<String> combined = future1.thenCombine(future2, (res1, res2) -> res1 + " " + res2);

        combined.thenAccept(System.out::println);

        //Use CompletableFuture to simulate a task that throws an exception.
        //Handle the exception gracefully.
        // Ensuring main thread waits for async tasks
        try { Thread.sleep(2000); } catch (InterruptedException e) { }
    }
}

