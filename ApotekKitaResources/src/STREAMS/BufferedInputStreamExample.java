package STREAMS;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        String text = "Siswa CCIT ada dua jenis, apa sajakah itu?";
        byte buff[] = text.getBytes();
        
        try(ByteArrayInputStream in = new ByteArrayInputStream(buff);
        BufferedInputStream f = new BufferedInputStream(in)){
            int c;
            while((c = f.read()) != -1){
                System.out.println((char)c);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}