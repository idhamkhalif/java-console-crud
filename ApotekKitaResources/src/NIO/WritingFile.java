package NIO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WritingFile {
    public static void main(String[] args) {
        String text = "Siswa CCIT sedang mencoba menulis sesuatu ke file";
        Path pth = Paths.get("D:/maven/NIO/menulis.txt");
        Charset cs = Charset.forName("US-ASCII");
        try(BufferedWriter penulis = Files.newBufferedWriter(pth, cs, StandardOpenOption.CREATE)){
            penulis.write(text);
            System.out.println("Selesai!");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
