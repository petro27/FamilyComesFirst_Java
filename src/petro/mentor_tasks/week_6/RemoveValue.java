package petro.mentor_tasks.week_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveValue {
    //ArrayList - Remove some values
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 100, 101, 102));
        list.removeIf(n->(n>100));
        System.out.println(list);
    }
}