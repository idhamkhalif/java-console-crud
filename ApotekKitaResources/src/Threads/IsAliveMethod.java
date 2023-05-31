package Threads;

class NewThreadClass implements Runnable {
    Thread t;
    
    NewThreadClass() {
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

public class IsAliveMethod {
    public static void main(String[] args) {
        NewThreadClass obj = new NewThreadClass();
        System.out.println(obj.t + " is alive? " + obj.t.isAlive());
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("Thread Utama Berulang: " + i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Utama diinterupt");
        }
        System.out.println(obj.t + " is alive? " + obj.t.isAlive());
        System.out.println("Thread Utama Berhenti!!!");
    }
}