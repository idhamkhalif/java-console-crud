package NIO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

class FileVisitorKu implements FileVisitor<Path>{

    @Override
    public FileVisitResult preVisitDirectory(Path folder, BasicFileAttributes bfa) throws IOException {
        System.out.println("Sedang mengunjungi "+folder);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path folder, BasicFileAttributes bfa) throws IOException {
        System.out.println("Saat ini mengunjungi "+folder);
        System.out.println("Apakah file ini sebuah folder? "+Files.isDirectory(folder));
        System.out.println("Pemeriksaan selesai!!!");
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path folder, IOException ioe) throws IOException {
        System.err.println(ioe.getMessage());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path folder, IOException ioe) throws IOException {
        System.out.println("Baru saja mengunjungi "+folder);
        return FileVisitResult.CONTINUE;
    }
    
}
        
public class TraversingExample {
    public static void main(String[] args) throws IOException {
        Path daftarFoler = Paths.get("D:/maven/NIO");
        FileVisitorKu obj = new FileVisitorKu();
        Files.walkFileTree(daftarFoler, obj);
    }
}
