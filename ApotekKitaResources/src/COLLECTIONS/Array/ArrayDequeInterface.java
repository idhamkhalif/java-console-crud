package COLLECTIONS.Array;

import java.util.ArrayDeque;
import java.util.ListIterator;

public class ArrayDequeInterface {
    public static void main(String[] args) {
        ArrayDeque<Double> obj = new ArrayDeque<Double>();
        Double dobj1 = new Double(33.9);
        Double dobj2 = new Double(99.3);
        Double dobj3 = new Double(77.5);
        Double dobj4 = new Double(55.7);
        
        System.out.println("Ukuran HashTable adalah: "+obj.size());
        
        obj.add(dobj1);
        obj.add(dobj2);
        
        System.out.println("\nHashTable setelah ditambahkan objek-objek: "+obj);
        System.out.println("Ukuran HashTable setelah ditambahkan objek-objek: "+obj.size());
        
        
        obj.addFirst(dobj3);
        obj.addLast(dobj4);
        
        System.out.println("\nHashTable setelah ditambahkan objek-objek diawal dan diakhir: "+obj);
        System.out.println("Ukuran HashTable setelah ditambahkan objek-objek diawal dan diakhir: "+obj.size());

        obj.removeFirst();
        
        System.out.println("\nHashTable setelah menghapus objek-objek diawal: "+obj);
        System.out.println("Ukuran HashTable setelah menghapus objek-objek diawal: "+obj.size());
    }
}