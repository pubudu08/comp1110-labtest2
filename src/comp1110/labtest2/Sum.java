package comp1110.labtest2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Pubudu Dissanayake on 9/1/15.
 * Project : comp1110-labtest2
 */
public class Sum extends ArrayList<Integer> {
    private int SUM_VALUE;
    public int sum() {
        return SUM_VALUE;
    }

    @Override
    public boolean add(Integer integer) {
        SUM_VALUE +=integer;
        return super.add(integer);
    }

    @Override
    public void add(int index, Integer element) {
        SUM_VALUE +=element;
        super.add(index, element);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        for(Integer integer : c){
            SUM_VALUE+=integer;
        }
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        for(Integer integer : c){
            SUM_VALUE+=integer;
        }
        return super.addAll(index, c);
    }

}
