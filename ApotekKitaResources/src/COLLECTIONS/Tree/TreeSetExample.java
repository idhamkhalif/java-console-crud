package COLLECTIONS.Tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> obj = new TreeSet<Integer>();
        Integer iobj1 = new Integer(3);
        Integer iobj2 = new Integer(4);
        Integer iobj3 = new Integer(5);
        Integer iobj4 = new Integer(6);
        
        System.out.println("Ukuran TreeSet adalah: "+obj.size());
        
        obj.add(iobj1);
        obj.add(iobj2);
        obj.add(iobj3);
        obj.add(iobj4);
        obj.add(iobj2);
        
        System.out.println("\nTreeSet setelah ditambahkan objek-objek: "+obj);
        System.out.println("Ukuran TreeSet setelah ditambahkan objek-objek: "+obj.size());
        
        obj.remove(iobj3);
        obj.remove(iobj1);
        
        System.out.println("\nTreeSet setelah menghapus objek-objek: "+obj);
        System.out.println("Ukuran TreeSet setelah menghapus objek-objek: "+obj.size());
        
        System.out.println("\nTreeSet bentuk Akhir: ");
        Iterator i = obj.iterator();
        while(i.hasNext()){
            System.out.println("HASIL: "+i.next());
        }
    }
}
