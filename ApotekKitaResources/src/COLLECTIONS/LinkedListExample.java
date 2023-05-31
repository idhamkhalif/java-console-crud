package COLLECTIONS;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<Integer>();
        Integer iobj1 = new Integer(9);
        Integer iobj2 = new Integer(7);
        Integer iobj3 = new Integer(5);
        Integer iobj4 = new Integer(3);
        
        System.out.println("Ukuran LinkedList adalah: "+obj.size());
        
        obj.add(iobj1);
        obj.add(iobj2);
        obj.add(iobj3);
        obj.add(iobj4);
        obj.add(iobj2);
        
        System.out.println("\nLinkedList setelah ditambahkan objek-objek: "+obj);
        System.out.println("Ukuran LinkedList setelah ditambahkan objek-objek: "+obj.size());
        
        obj.remove(iobj2);
        obj.remove(iobj3);
        
        System.out.println("\nLinkedList setelah menghapus objek-objek: "+obj);
        System.out.println("Ukuran LinkedList setelah menghapus objek-objek: "+obj.size());
        
        System.out.println("\nLinkedList bentuk Akhir: ");
        ListIterator i = obj.listIterator();
        while(i.hasNext()){
            System.out.println("HASIL: "+i.next());
        }
    }
}
