package NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeletingDirectory {
    public static void main(String[] args) throws IOException {
        Path target = Paths.get("D:/maven/NIO/coba");
        Files.delete(target);
    }
}