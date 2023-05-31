package Threads;

import java.awt.Color;
import java.util.Random;
import javax.swing.*;

public class MultipleThreadsSatu extends Thread{
    JTextField tf;
    JLabel l;
    JPanel p1, p2, p3;
    JFrame f;
    
    public MultipleThreadsSatu(){
        buatGUI();
    }
    public MultipleThreadsSatu(String s){
        super(s);
    }
    
    @Override
    public void run(){
        if(Thread.currentThread().getName().equals("satu")){
            jalanBuntuSatu();
        }
        if(Thread.currentThread().getName().equals("dua")){
            jalanBuntuDua();
        }
        if(Thread.currentThread().getName().equals("tiga")){
            jalanBuntuTiga();
        }
    }
    
    private void buatGUI() {
        f = new JFrame("Memindahkan Objek");
        f.setVisible(true);
        f.setSize(400, 200);
        f.setLayout(null);
        l = new JLabel("");
        l.setBounds(10, 10, 400, 20);
        f.add(l);
        
        p1 = new JPanel();
        p1.setSize(20, 20);
        p1.setBackground(Color.red);
        p1.setBounds(10, 40, 20, 20);
        f.add(p1);
        
        p2 = new JPanel();
        p2.setSize(20, 20);
        p2.setBackground(Color.blue);
        p2.setBounds(10, 80, 20, 20);
        f.add(p2);
        
        p3 = new JPanel();
        p3.setSize(20, 20);
        p3.setBackground(Color.green);
        p3.setBounds(10, 120, 20, 20);
        f.add(p3);
    }
    
    public static void main(String[] args) {
        MultipleThreadsSatu obj = new MultipleThreadsSatu();
        Thread jalan1 = new Thread(obj);
        Thread jalan2 = new Thread(obj);
        Thread jalan3 = new Thread(obj);
        
        jalan1.setName("satu");
        jalan2.setName("dua");
        jalan3.setName("tiga");
        
        jalan1.start();
        jalan2.start();
        jalan3.start();
    }

    private void jalanBuntuSatu() {
        Random ran = new Random();
        int s = ran.nextInt(100);
        for(int i=-10; i<400; i++){
            p1.setBounds(i, s, 20, 20);
            try{
                Thread.sleep(5);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        jalanBuntuTiga();
    }

    private void jalanBuntuDua() {
        Random ran = new Random();
        int r = ran.nextInt(180);
        for(int i=-10; i<400; i++){
            p2.setBounds(i, r, 20, 20);
            try{
                Thread.sleep(11);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        jalanBuntuSatu();
    }

    private void jalanBuntuTiga() {
        Random ran = new Random();
        int m = ran.nextInt(10);
        for(int i=-10; i<400; i++){
            p3.setBounds(i, m, 20, 20);
            try{
                Thread.sleep(10);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        jalanBuntuDua();
    }
}