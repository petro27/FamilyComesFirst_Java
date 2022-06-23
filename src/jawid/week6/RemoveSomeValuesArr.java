package jawid.week6;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSomeValuesArr {
/*
 1️⃣ ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
*/
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,45,67,78,300,200, 120, 6,9,10));
    list.removeIf(value -> value >100);
    System.out.println(list);


/*
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 100, 101, 102));
        list.removeIf(n->(n>100));
        System.out.println(list);
*/

}
}
