package NIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingFile {
    public static void main(String[] args) {
        Path pth = Paths.get("D:/maven/NIO/Hello.java");
        Charset cs = Charset.forName("US-ASCII");
        try(BufferedReader pembaca = Files.newBufferedReader(pth, cs)){
            String baris = null;
            while((baris = pembaca.readLine()) != null){
                System.out.println(baris);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
