package jawid.week7;

import java.util.*;

public class FindUniqueCharFromString {
    /*
    ️2️⃣  Map - find unique character from String
    */
    public static void mapUniqueChar() {

        String str = "accabbcde";
        Map<Character, Integer> unique = new HashMap<>();

        for (int j = 0; j < str.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (count == 1) {
                unique.put(str.charAt(j), count);
            }
        }

        System.out.println(unique);
    }
}