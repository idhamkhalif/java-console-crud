package COLLECTIONS.Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        String sobj1 = new String("Tirta");
        String sobj2 = new String("Souja");
        String sobj3 = new String("Toma");
        String sobj4 = new String("Jacob");
        
        System.out.println("Ukuran ArrayList adalah: "+obj.size());
        
        obj.add(sobj1);
        obj.add(sobj2);
        obj.add(sobj3);
        obj.add(sobj4);
        obj.add(sobj2);
        
        System.out.println("\nArrayList setelah ditambahkan objek-objek: "+obj);
        System.out.println("Ukuran ArrayList setelah ditambahkan objek-objek: "+obj.size());
        
        obj.remove(2);
        obj.remove(sobj4);
        
        System.out.println("\nArrayList setelah menghapus objek-objek: "+obj);
        System.out.println("Ukuran ArrayList setelah menghapus objek-objek: "+obj.size());
        
        System.out.println("\nArrayList bentuk Akhir: ");
        ListIterator i = obj.listIterator();
        while(i.hasNext()){
            System.out.println("HASIL: "+i.next());
        }
    }
}
