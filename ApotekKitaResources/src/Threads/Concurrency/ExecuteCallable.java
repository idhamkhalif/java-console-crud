package Threads.Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Perintah implements Callable{

    String namaPerintah;
    
    public Perintah(String nama){
        namaPerintah = nama;
    }
    @Override
    public String call() {
        System.out.println("Nama Perintah adalah: "+namaPerintah+" dieksekusi oleh "+Thread.currentThread().getName());
        return namaPerintah;
    }
}
public class ExecuteCallable {
    public static void main(String[] args) {
        Perintah a = new Perintah("Perintah1");
        Perintah b = new Perintah("Perintah2");
        Perintah c = new Perintah("Perintah3");
        
        ExecutorService threadExPool1 = Executors.newFixedThreadPool(3);
        ExecutorService threadExPool2 = Executors.newFixedThreadPool(3);
        
        Future<String> f1 = threadExPool1.submit(a);
        Future<String> f2 = threadExPool2.submit(b);
        Future<String> f3 = threadExPool2.submit(c);
    }
}