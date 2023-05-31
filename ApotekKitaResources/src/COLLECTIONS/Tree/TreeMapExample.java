package COLLECTIONS.Tree;

import java.util.TreeMap;
import java.util.ListIterator;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> obj = new TreeMap<Integer, String>();
        String sobj1 = new String("Tirta");
        String sobj2 = new String("Souja");
        String sobj3 = new String("Toma");
        String sobj4 = new String("Jacob");
        
        System.out.println("Ukuran TreeMap adalah: "+obj.size());
        
        obj.put(1, sobj1);
        obj.put(2, sobj2);
        obj.put(3, sobj3);
        obj.put(4, sobj4);
        obj.put(5, sobj1);
        
        System.out.println("\nTreeMap setelah ditambahkan objek-objek: "+obj);
        System.out.println("Ukuran TreeMap setelah ditambahkan objek-objek: "+obj.size());
        
        obj.remove(3);
        obj.remove(5);
        
        System.out.println("\nTreeMap setelah menghapus objek-objek: "+obj);
        System.out.println("Ukuran TreeMap setelah menghapus objek-objek: "+obj.size());
    }
}