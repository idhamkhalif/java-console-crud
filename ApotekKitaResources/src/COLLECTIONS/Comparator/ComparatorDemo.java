package COLLECTIONS.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ComparatorInterface cd1 = new ComparatorInterface("Tirta", 33);
        ComparatorInterface cd2 = new ComparatorInterface("Tirta", 99);
        ComparatorInterface cd3 = new ComparatorInterface("Tirta", 93);
        
        ArrayList<ComparatorInterface> obj = new ArrayList<>();
        obj.add(cd1);
        obj.add(cd2);
        obj.add(cd3);
        
        System.out.println("Detail Jajan Somebody adalah:");
        
        ListIterator li = obj.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
        
        Collections.sort(obj, new JajanCompare());
        
        System.out.println("Jajan disortir:");
        
        ListIterator lii = obj.listIterator();
        while(lii.hasNext()){
            System.out.println(lii.next());
        }
        
        Collections.sort(obj, new NamaCompare());
        
        System.out.println("Nama disortir:");
        
        ListIterator liii = obj.listIterator();
        while(liii.hasNext()){
            System.out.println(liii.next());
        }
    }
}
