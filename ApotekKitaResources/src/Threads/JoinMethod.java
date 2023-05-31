package Threads;

class ThreadAnak implements Runnable {

    Thread t;

    ThreadAnak() {
        t = new Thread(this, "Thread Anak");
        System.out.println("Thread dibuat: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(t + " loop: " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread: " + t + " diinterupt");

        }
    }
}

public class JoinMethod {

    public static void main(String[] args) {
        ThreadAnak obj = new ThreadAnak();
        System.out.println(obj.t + " is alive? " + obj.t.isAlive());
        try {
            System.out.println("Thread Utama Menunggu Thread Anak Selesai: ");
            obj.t.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Utama diinterupt");
        }
        System.out.println(obj.t + " is alive? " + obj.t.isAlive());
        System.out.println("Thread Utama Berhenti!!!");
    }
}