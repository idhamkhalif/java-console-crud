package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectoriesExample {
    public static void main(String[] args) {
        Path buat_folder = Paths.get("D:/maven/NIO/NIOExample");
        try{
            Files.createDirectories(buat_folder);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}