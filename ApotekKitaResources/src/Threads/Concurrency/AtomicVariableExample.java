package Threads.Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableExample {
    public static void main(String[] args) {
        AtomicInteger nilai = new AtomicInteger(5);
        System.out.println("Nilai yang diberikan: "+nilai);
        nilai.getAndIncrement();
        System.out.println("Setelah INCREMENT, nilai menjadi: "+nilai.get());
        nilai.set(40);
        System.out.println("Setalah di SETTING ULANG, nilai menjadi: "+nilai.get());
        nilai.getAndDecrement();
        System.out.println("Setelah DECREAMENT, nilai menjadi: "+nilai.get());
        nilai.compareAndSet(39, 45);
        System.out.println("Setelah di UPDATE, nilai menjadi: "+nilai.get());
    }
}
