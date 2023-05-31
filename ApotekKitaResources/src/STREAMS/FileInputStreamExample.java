package STREAMS;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        int i;
        char c;
        try(FileInputStream f = new FileInputStream("D:\\maven\\text.txt")){
            while((i = f.read()) != -1){
                c = (char) i;
                System.out.println(c);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
