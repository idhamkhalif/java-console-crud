package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class CheckingExistenceOfFile {
    public static void main(String[] args) {
        Path target = Paths.get("D:/maven/NIO/NIOExample");
        Boolean pathExists = Files.exists(target, LinkOption.NOFOLLOW_LINKS);
        System.out.println(pathExists);
    }
}
