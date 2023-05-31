package Threads;

class ThreadAnakLagi implements Runnable {

    Thread t;

    ThreadAnakLagi(int p) {
        t = new Thread(this, "Thread Anak");
        t.setPriority(p);
        System.out.println("Thread dibuat: " + t);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(t + " loop: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread: " + t + " diinterupt");

        }
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
        ThreadAnakLagi obj_satu = new ThreadAnakLagi(Thread.NORM_PRIORITY - 2);
        ThreadAnakLagi obj_dua = new ThreadAnakLagi(Thread.NORM_PRIORITY + 2);
        ThreadAnakLagi obj_tiga = new ThreadAnakLagi(Thread.NORM_PRIORITY + 3);

        // MEMULAI THREAD DENGAN PRIORITAS YANG BERBEDA
        obj_satu.t.start();
        obj_dua.t.start();
        obj_tiga.t.start();

        try {
            System.out.println("Thread Utama Menunggu Thread Anak Selesai: ");
            obj_satu.t.join();
            obj_dua.t.join();
            obj_tiga.t.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Utama diinterupt");
            System.out.println(obj_satu.t + " is alive? " + obj_satu.t.isAlive());
            System.out.println(obj_dua.t + " is alive? " + obj_dua.t.isAlive());
            System.out.println(obj_tiga.t + " is alive? " + obj_tiga.t.isAlive());
            System.out.println("Thread Utama Berhenti!!!");
        }
    }
}
