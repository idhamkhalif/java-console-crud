package STREAMS;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try(FileWriter f = new FileWriter("D:\\maven\\text2.txt")){
            String text = "Siswa CCIT Menulis ke File text2.txt";
            char buff[] = new char[text.length()];
            text.getChars(0, text.length(), buff, 0);
            f.write(buff);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
