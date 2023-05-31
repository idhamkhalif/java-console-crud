package Threads;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ThreadExtendingThreadClass extends Thread{
    JTextField tf;
    JLabel l;
    JFrame f;
    
    @Override
    public void run(){
        buatGUI();
    }

    void tampilkan(){
        for(int i=60; i>=0; i--){
            try{
                Thread.sleep(1000);
                String s = Integer.toString(i);
                tf.setText("     "+s+" detik tersisa...");
            }catch(Exception e){
                System.out.println(e);
            }
        }
        JOptionPane.showMessageDialog(f, "Waktu Habis!!!");
        tf.setText("");
        tf.setEnabled(false);
    }
    private void buatGUI() {
        f = new JFrame("Hitung Mundur");
        JPanel p = new JPanel();
        l = new JLabel("");
        tf = new JTextField(15);
        tf.setEnabled(false);
        Font fn = new Font("Century", 0, 18);
        tf.setFont(fn);
        tf.setDisabledTextColor(Color.BLACK);
        tf.setBackground(Color.YELLOW);
        p.setBackground(Color.black);
        f.add(p);
        p.add(tf);
        p.add(l);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 100);
        f.setResizable(false);
        tampilkan();
    }
    
    public static void main(String[] args) {
        ThreadExtendingThreadClass obj = new ThreadExtendingThreadClass();
        obj.start();
    }
}
