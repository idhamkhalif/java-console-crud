package STREAMS;

import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        try(BufferedOutputStream b = new BufferedOutputStream(System.out)){
            String text = "Siswa CCIT adalah generasi Tik Tok";
            byte buff[] = text.getBytes();
            
            b.write(buff);
            b.flush();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
