package Threads;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Thread yang ada saat ini: "+t);
        t.setName("Thread Utama");
        System.out.println("Thread setelah GANTI NAMA: "+t);
        System.out.println("Thread yang ada saat ini di SLEEP selama 10 detik");
        try{
            t.sleep(10000);
        }catch(InterruptedException e){
            System.out.println("Thread utama diinterupt!");
        }
        System.out.println(" Setelah 10 detik, Thread saat ini ADA KEMBALI");
    }
}
