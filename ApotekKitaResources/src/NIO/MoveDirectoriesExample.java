package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class MoveDirectoriesExample {
    public static void main(String[] args) {
        Path sumber = Paths.get("D:/maven/NIO/Hello.java");
        Path target = Paths.get("D:/maven/NIO/NIOExample/Hello.java");
        try{
            Files.move(sumber, target, REPLACE_EXISTING);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
