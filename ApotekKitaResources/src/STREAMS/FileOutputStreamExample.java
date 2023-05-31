package STREAMS;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        boolean b;
        long pos;
        String text = "Siswa CCIT itu ...";
        byte buff[] = text.getBytes();
        
        try(FileOutputStream fo = new FileOutputStream("D:\\maven\\text1.txt")){
            for(int i=0; i<buff.length; i++){
                fo.write(buff[i]);
            }
        }catch(Exception e){
        System.out.println(e);
    }
    }
}
