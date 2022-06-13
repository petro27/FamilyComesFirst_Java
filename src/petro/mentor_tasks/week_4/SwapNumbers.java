package petro.mentor_tasks.week_4;

import java.util.*;

public class SwapNumbers {
    //Numbers - Swap Numbers

    public static void swapNumbers(List<Integer>list) {

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 2) {

            list1.add(list.get(i + 1));
            list1.add(list.get(i));

        }
        System.out.println(list1);
    }

    public static void main(String[] args) {
        swapNumbers(Arrays.asList(1,2));
    }
}