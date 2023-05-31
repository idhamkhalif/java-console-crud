package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CopyDirectoriesExample {
    public static void main(String[] args) {
        Path sumber = Paths.get("D:/maven/Hello.java");
        Path target = Paths.get("D:/maven/NIO/Hello.java");
        try{
            Files.copy(sumber, target, REPLACE_EXISTING, COPY_ATTRIBUTES);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
