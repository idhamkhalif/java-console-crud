//package Threads.Synchronization;
//
//class SynchronizedMethods{
//    int d;
//    synchronized void getData(){
//        System.out.println("Data yang di-GET: "+d);
//    }
//    
//    synchronized void setData(int d){
//        this.d = d;
//        System.out.println("Data yang di-SET: "+d);
//    }
//}
//
//class Penjual extends Thread{
//    SynchronizedMethods t;
//    public Penjual(SynchronizedMethods t){
//        this.t = t;
//    }
//    public void run(){
//        int data = 700;
//        while(true){
//            System.out.println("SET dipanggil oleh Class Penjual");
//            t.setData(data++);
//        }
//    }
//}
//
//class Pembeli extends Thread{
//    SynchronizedMethods t;
//    public Pembeli(SynchronizedMethods t){
//        this.t = t;
//    }
//    public void run(){
//        int data = 700;
//        while(true){
//            System.out.println("GET dipanggil oleh Class Penjual");
//            t.getData();
//        }
//    }
//}
//public class SynchronizedExampleBug {
//    public static void main(String[] args) {
//        SynchronizedMethods obj = new SynchronizedMethods();
//        Penjual pj = new Penjual(obj);
//        Pembeli pb = new Pembeli(obj);
//        pj.start();
//        pb.start();
//    }
//}
