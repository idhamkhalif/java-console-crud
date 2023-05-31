package COLLECTIONS.Hash;

import java.util.Hashtable;
import java.util.ListIterator;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, Double> obj = new Hashtable<Integer, Double>();
        Double dobj1 = new Double(33.9);
        Double dobj2 = new Double(99.3);
        Double dobj3 = new Double(77.5);
        Double dobj4 = new Double(55.7);
        
        System.out.println("Ukuran HashTable adalah: "+obj.size());
        
        obj.put(1, dobj1);
        obj.put(2, dobj2);
        obj.put(3, dobj3);
        obj.put(4, dobj4);
        obj.put(5, dobj3);
        
        System.out.println("\nHashTable setelah ditambahkan objek-objek: "+obj);
        System.out.println("Ukuran HashTable setelah ditambahkan objek-objek: "+obj.size());
        
        obj.remove(3);
        obj.remove(5);
        
        System.out.println("\nHashTable setelah menghapus objek-objek: "+obj);
        System.out.println("Ukuran HashTable setelah menghapus objek-objek: "+obj.size());
    }
}