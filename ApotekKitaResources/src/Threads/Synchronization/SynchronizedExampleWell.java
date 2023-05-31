package Threads.Synchronization;

class SynchronizedMethod{
    int d;
    boolean penanda = false;
    synchronized int getData(){
        if(!penanda){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Exception caught!!!");
            }
        }
        System.out.println("Data yang didapat: "+d);
        penanda = false;
        notifyAll();
        return d;
    }
    
    synchronized void setData(int p){
        if(penanda){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Exception caught!!!");
            }
        }
        this.d = p;
        penanda = true;
        System.out.println("SET data dengan nilai: "+ d);
        notify();
    }
}

class PenjualBarang implements Runnable{
    SynchronizedMethod t;
    public PenjualBarang(SynchronizedMethod t){
        this.t = t;
        new Thread(this, "PenjualBarang").start();
        System.out.println("SET dipanggil oleh Class Penjual");
    }
    public void run(){
        int data = 0;
        while(true){
            data += 1;
            t.setData(data);
        }
    }
}

class PembeliBarang implements Runnable{
    SynchronizedMethod t;
    public PembeliBarang(SynchronizedMethod t){
        this.t = t;
        new Thread(this, "PembeliBarang").start();
        System.out.println("GET dipanggil oleh Class Penjual");
    }
    public void run(){
        while(true){
            t.getData();
        }
    }
}

public class SynchronizedExampleWell {
    public static void main(String[] args) {
        SynchronizedMethod obj = new SynchronizedMethod();
        PenjualBarang pj = new PenjualBarang(obj);
        PembeliBarang pb = new PembeliBarang(obj);
    }
}