package jawid.week6;

import java.util.*;

public class SortMap {
    /*
    4️⃣Map - Sort the map by values
    Write a method that can sort the Map by values.
    */
    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        map = new LinkedHashMap();
        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }
        return map;
    }
}


