package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> aList = new ArrayList<>();
       aList.add(0);
       aList.add(1);
       aList.add(2);
       aList.add(3);
       aList.add(4);
       aList.add(5);
       aList.add(6);
       aList.add(7);
       aList.add(8);
       aList.add(9);

        Iterator <Integer> iterator = aList.iterator();

        while (iterator.hasNext()) {
            int tmp = iterator.next();
            System.out.println(tmp);
        }
    }
}
