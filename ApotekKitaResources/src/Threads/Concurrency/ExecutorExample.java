package Threads.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tugas implements Runnable{

    String namaTugas;
    
    public Tugas(String nama){
        namaTugas = nama;
    }
    @Override
    public void run() {
        System.out.println("Nama Tugas adalah: "+namaTugas+" dieksekusi oleh "+Thread.currentThread().getName());
    }
}
public class ExecutorExample {
    public static void main(String[] args) {
        Tugas a = new Tugas("Tugas1");
        Tugas b = new Tugas("Tugas2");
        Tugas c = new Tugas("Tugas3");
        
        ExecutorService threadExecutor = Executors.newCachedThreadPool();
        System.out.println("Executor Dimulai");
        threadExecutor.execute(a);
        threadExecutor.execute(b);
        threadExecutor.execute(c);
        threadExecutor.shutdown();
        if(threadExecutor.isShutdown()){
            System.out.println("Semua Tugas selesai. Executor dimatikan");
        }
    }
}
