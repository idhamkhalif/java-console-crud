package NIO;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;

class CariFile implements FileVisitor{
    
    private final PathMatcher matcher;
    int counter = 0;
    
    public CariFile(String pattern){
        FileSystem fs = FileSystems.getDefault();
        matcher = fs.getPathMatcher("glob:"+pattern);
    }
    
    void cari(Path file) throws IOException{
        Path nama = file.getFileName();
        
        if(nama != null && matcher.matches(nama)){
            System.out.println("Menacari lokasi file: "+nama+" in "+
                    file.getParent().toAbsolutePath());
            counter++;
        }
    }

    @Override
    public FileVisitResult preVisitDirectory(Object t, BasicFileAttributes bfa) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Object file, BasicFileAttributes bfa) throws IOException {
        cari((Path) file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Object t, IOException ioe) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Object t, IOException ioe) throws IOException {
        return FileVisitResult.CONTINUE;
    }
    
}

public class SearchingFile {
    public static void main(String[] args) throws IOException {
        String pattern = "*.java";
        Path fileTree = Paths.get("D:/maven/NIO/");
        CariFile obj = new CariFile(pattern);
        EnumSet opsi = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        Files.walkFileTree(fileTree, opsi, Integer.MAX_VALUE, obj);
        System.out.println("TOTAL file .java yang DITEMUKAN: "+obj.counter);
    }
}
