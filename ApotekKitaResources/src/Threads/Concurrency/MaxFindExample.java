package Threads.Concurrency;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class MaxFindExample extends RecursiveTask<Integer>{
    private static final int SEQUENTIAL_THRESHOLD = 100;
    
    private final int[] data;
    private final int start;
    private final int end;
    
    public MaxFindExample(int[] data, int start, int end){
        this.data = data;
        this.start = start;
        this.end = end;
    }
    
    public MaxFindExample(int[] data){
        this(data, 0, data.length);
    }
    
    public static void main(String[] args) {
        // MEMBUAT DATA SET SECARA ACAK
        final int[] data = new int[200];
        final Random rand = new Random();
        for(int i=0; i<data.length; i++){
            data[i] = rand.nextInt(350);
        }
        
        // SIMPAN PERINTAH KE POOL
        final ForkJoinPool pool = new ForkJoinPool(4);
        final MaxFindExample finder = new MaxFindExample(data);
        System.out.println("Nilai MAXIMUM adalah: "+pool.invoke(finder));
    }

    @Override
    protected Integer compute() {
        final int length = end -start;
        if(length < SEQUENTIAL_THRESHOLD){
            return computeDirectly();
        }
        final int split = length / 2;
        final MaxFindExample left = new MaxFindExample(data, start, start + split);
        left.fork();
        final MaxFindExample right = new MaxFindExample(data, start + split, end);
        return Math.max(right.compute(), left.join());
    }

    private Integer computeDirectly() {
        System.out.println(Thread.currentThread()+" sedang mencari index array: "+start+" to "+end);
        int max = Integer.MIN_VALUE;
        for(int i=start; i<end; i++){
            if(data[i] > max){
                max = data[i];
            }
        }
        return max;
    }
}
