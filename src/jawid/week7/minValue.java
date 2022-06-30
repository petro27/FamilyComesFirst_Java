package jawid.week7;

import java.util.*;

public class minValue {
/*
3️⃣Map - Min value
Write a method that can return the minimum value from ta map (DO NOT use sort method)
*/
public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("one", -1);
    map.put("two", 0);
    map.put("three", 3);
    map.put("four", 100000);
    map.put("five", 5);
    System.out.println(map);

    Integer minValue = Integer.MAX_VALUE;

    for (Integer eachValue : map.values()) {
        if (eachValue < minValue){
            minValue = eachValue;
        }
    }
    System.out.println();
    System.out.println("Min Value is: " + minValue);
}

}
