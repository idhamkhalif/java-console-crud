package COLLECTIONS.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ComparableDemo {
    public static void main(String[] args) {
        ComparableInterface ci1 = new ComparableInterface("Tirta", 33);
        ComparableInterface ci2 = new ComparableInterface("Toma", 99);
        ComparableInterface ci3 = new ComparableInterface("Souja", 93);
        
        ArrayList<ComparableInterface> obj = new ArrayList<>();
        obj.add(ci1);
        obj.add(ci2);
        obj.add(ci3);
        
        System.out.println("Detail Jajan Somebody adalah:");
        
        ListIterator li = obj.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
        
        Collections.sort(obj);
        
        System.out.println("Detail jajan somebody SETELAH DISORTING:");
        
        ListIterator lii = obj.listIterator();
        while(lii.hasNext()){
            System.out.println(lii.next());
        }
    }
}
