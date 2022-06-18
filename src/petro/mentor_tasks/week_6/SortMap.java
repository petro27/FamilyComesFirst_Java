package petro.mentor_tasks.week_6;

import java.util.*;

public class SortMap {
    //Map - Sort the map by values
    //Write a method that can sort the Map by values

    public static void sortByGrades(){
        List<String> students = new ArrayList<>(Arrays.asList("John","Chris","Laura","Andy"));
        List<Double> grades = new ArrayList<>(Arrays.asList(4.0,3.7,3.9,3.2));

        Map<List<String>,List<Double>> map = new HashMap<>();
        map.put(students,grades);


        for (List<Double> eachGrade: map.values()) {
            Collections.sort(eachGrade);
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        sortByGrades();
    }
}
