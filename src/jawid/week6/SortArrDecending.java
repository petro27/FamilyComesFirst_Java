package jawid.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrDecending {
/*
3️⃣ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method
     */
public static void sortDescending() {

    List<Integer> list = new ArrayList<>(Arrays.asList(3, 4, 0, 1, 2, 5, 0, 7, 6, 0, 0, 0, -4, -98));

    for (int i = 0; i < list.size(); i++) {
        for (int j = list.size() - 1; j > i; j--) {
            int temp = list.get(i);
            if (list.get(i) < list.get(j)) {
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
    }
    System.out.println(list);
}
}
