package NIO;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class WatchServiceExample {

    private Path pth = null;
    WatchService ws;

    private void inisialisasiService() {
        // MENENTUKAN PATH DIREKTORI YANG AKAN DIMONITOR
        pth = Paths.get("D:/maven/NIO");
        try {
            ws = FileSystems.getDefault().newWatchService();
            pth.register(ws, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void memonitorDirektori() {
        WatchKey key = null;
        // INFINITY LOOP UNTUK MENGECEK PERUBAHAN
        while (true) {
            try {
                // MENDAPATKAN WATCH KEY
                key = ws.take();
                for (WatchEvent event : key.pollEvents()) {
                    // MENDAPATKAN EVENT KIND
                    Kind kind = event.kind();
                    System.out.println("Event yang muncul di: " + event.context().toString() + " is " + kind);
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            boolean reset = key.reset();
            if (!reset) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        WatchServiceExample obj = new WatchServiceExample();
        obj.inisialisasiService();
        obj.memonitorDirektori();
    }
}