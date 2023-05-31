package COLLECTIONS;

import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Double> obj = new Vector<Double>();
        Double dobj1 = new Double(9.3);
        Double dobj2 = new Double(7.3);
        Double dobj3 = new Double(5.3);
        Double dobj4 = new Double(3.3);
        
        System.out.println("Ukuran Vector adalah: "+obj.size());
        
        obj.add(dobj1);
        obj.add(dobj2);
        obj.add(dobj3);
        obj.add(dobj4);
        obj.add(dobj1);
        
        System.out.println("\nVector setelah ditambahkan objek-objek: "+obj);
        System.out.println("Ukuran Vector setelah ditambahkan objek-objek: "+obj.size());
        
        obj.remove(dobj1);
        obj.remove(dobj3);
        
        System.out.println("\nVector setelah menghapus objek-objek: "+obj);
        System.out.println("Ukuran Vector setelah menghapus objek-objek: "+obj.size());
        
        System.out.println("\nVector bentuk Akhir: ");
        ListIterator i = obj.listIterator();
        while(i.hasNext()){
            System.out.println("HASIL: "+i.next());
        }
    }
}