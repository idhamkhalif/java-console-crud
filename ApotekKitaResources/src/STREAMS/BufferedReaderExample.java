package STREAMS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Masukkan Angka Pertama");
            String x = br.readLine();
            System.out.println("Masukkan Angka Kedua");
            String y = br.readLine();
            int i = Integer.parseInt(x);
            int j = Integer.parseInt(y);
            int k = i + j;
            System.out.println("Hasil: "+k);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}