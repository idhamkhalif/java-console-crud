package Threads.Concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentRantLockExample implements Runnable{
    final Lock l = new ReentrantLock();
    String nama;
    Thread t;
    
    public void membuatThread(String namaThread){
        nama = namaThread;
        t = new Thread(this, nama);
        System.out.println("Membuat Thread Baru: "+t.getName());
        t.start();
    }
    public static void main(String[] args) {
        ReentRantLockExample obj = new ReentRantLockExample();
        obj.membuatThread("Thread Satu");
        obj.membuatThread("Thread Dua");
        obj.membuatThread("Thread Tiga");
    }

    @Override
    public void run() {
        do{
            try{
                if(l.tryLock(400, TimeUnit.MILLISECONDS)){
                    try{
                    System.out.println(Thread.currentThread().getName()+" Melakukan LOCK");
                    Thread.sleep(1000);
                }finally{
                        l.unlock();
                        System.out.println(Thread.currentThread().getName()+" Melepas LOCK");
                        }
                break;
                }else{
                    System.out.println(Thread.currentThread().getName()+" Tidak bisa melakukan LOCK. Perlu melakukan LOCK kembali");
                }
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }while(true);
    }
}