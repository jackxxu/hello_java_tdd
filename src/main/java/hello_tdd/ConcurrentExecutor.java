package hello_tdd;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrentExecutor {
    
    public int sum(int i, int j) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<Integer> future = executor.submit( new DoMath(i, j) );
        int val = future.get();
        executor.shutdown();
        return val;
    }
    
}
