package COLLECTIONS.Comparator;

import java.util.Comparator;

public class JajanCompare implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        ComparatorInterface cx = (ComparatorInterface) t;
        ComparatorInterface cy = (ComparatorInterface) t1;
        return cx.getNama().compareTo(cy.getNama());
    }
}