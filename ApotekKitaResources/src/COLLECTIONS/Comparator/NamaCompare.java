package COLLECTIONS.Comparator;

import java.util.Comparator;

public class NamaCompare implements Comparator {

    @Override
    public int compare(Object t, Object t1) {
        ComparatorInterface cx = (ComparatorInterface) t;
        ComparatorInterface cy = (ComparatorInterface) t1;
        
        if(cx.getJajan() > cy.getJajan())
            return 1;
        else if(cx.getJajan() < cy.getJajan())
            return -1;
        else
            return 0;
    }
}
