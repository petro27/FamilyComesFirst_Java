package petro.mentor_tasks.week_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingDescending {

    public static void sortDescending(){

        List<Integer> list =new ArrayList<>(Arrays.asList(3,4,0,1,2,5,0,7,6,0,0,0,-4,-98));

        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size()-1; j > i; j--) {
                int temp = list.get(i);
                if(list.get(i) < list.get(j)){
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        sortDescending();
    }
}
