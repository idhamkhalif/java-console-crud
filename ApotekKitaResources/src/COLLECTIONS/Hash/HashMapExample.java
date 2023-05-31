package COLLECTIONS.Hash;

import java.util.HashMap;
import java.util.ListIterator;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> obj = new HashMap<String, Integer>();
        Integer iobj1 = new Integer(9);
        Integer iobj2 = new Integer(7);
        Integer iobj3 = new Integer(5);
        Integer iobj4 = new Integer(3);
        
        System.out.println("Ukuran HashMap adalah: "+obj.size());
        
        obj.put("L1", iobj1);
        obj.put("L2", iobj2);
        obj.put("L3", iobj3);
        obj.put("L4", iobj4);
        obj.put("L5", iobj1);
        
        System.out.println("\nHashMap setelah ditambahkan objek-objek: "+obj);
        System.out.println("Ukuran HashMap setelah ditambahkan objek-objek: "+obj.size());
        
        obj.remove("L3");
        obj.remove("L5");
        
        System.out.println("\nHashMap setelah menghapus objek-objek: "+obj);
        System.out.println("Ukuran HashMap setelah menghapus objek-objek: "+obj.size());
    }
}