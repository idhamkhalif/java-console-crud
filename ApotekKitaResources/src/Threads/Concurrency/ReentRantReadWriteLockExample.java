package Threads.Concurrency;

import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class ThreadLock extends Thread {

    private static final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    @Override
    public void run() {
        try {
            bacaData();
            sleep(2000);
            tulisData();
        } catch (final Exception e) {
            System.out.println(e);
        }
    }

    private void bacaData() {
        try{
            rwl.readLock().lock();
            System.out.println(Thread.currentThread().getName()+" sedang membaca data dan nilainya adalah 5");
        }finally{
            System.out.println(Thread.currentThread().getName()+" keluar setelah selesai membaca data");
            rwl.readLock().unlock();
        }
    }

    private void tulisData() {
        try{
            rwl.writeLock().lock();
            Random rand = new Random();
            int n = rand.nextInt(50);
            System.out.println(Thread.currentThread().getName()+" mempunyai WRITE LOCK dan sedang menulis data");
            System.out.println("Nilai barunya adalah: "+(5+n));
        }finally{
            System.out.println(Thread.currentThread().getName()+" melepaskan LOCK dan keluar setelah selesai menulis data");
            rwl.writeLock().unlock();
        }
    }
}

public class ReentRantReadWriteLockExample {
    public static void main(String[] args) {
        ThreadLock obj_satu = new ThreadLock();
        ThreadLock obj_dua = new ThreadLock();
        obj_satu.start();
        obj_dua.start();
    }
}
