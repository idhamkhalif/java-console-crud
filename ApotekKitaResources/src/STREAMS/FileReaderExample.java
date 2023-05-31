package STREAMS;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try(FileReader f = new FileReader("D:\\maven\\text.txt")){
            char[] a = new char[50];
            f.read(a);
            for(char c : a){
                System.out.println(c);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}