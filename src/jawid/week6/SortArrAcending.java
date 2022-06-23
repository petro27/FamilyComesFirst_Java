package jawid.week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrAcending {
/*
️2️⃣ ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method
*/
public ArrayList<Integer> removeValues(ArrayList<Integer> list) {
ArrayList<Integer> list1 =new ArrayList<>(Arrays.asList(2,55,5,6,82,1,2,3,5,100));
for (Integer each : list1){

}
    return list1;
}

    public static void sortAscending(){
        List<Integer> list =new ArrayList<>(Arrays.asList(3,4,0,1,2,5,0,7,6,0,0,0,-4,-2,-98));
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size()-1; j > i; j--) {
                int temp = list.get(i);
                if(list.get(i) > list.get(j)){
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        System.out.println(list);
    }
}
