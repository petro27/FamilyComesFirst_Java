package jawid.week7;

import java.util.*;

public class FrequencyOfCharacters {
/*
 1️⃣  Map - Frequency of Characters
Write a method that prints the frequency of each character from a String
*/
//public static void frequencyOfEachChar(String str){
//    Map<Character, Integer> counter = new LinkedHashMap<>();
//    for (int i = 0; i < str.length(); i++) {
//        char key = str.charAt(i);
//        if (counter.containsKey(str.charAt(i))){
//            // the letter/char was found before, this is a duplicate occurrence, so we will need to update the counter for it, which is the value in our map
//            counter.put(key, counter.get(key)+1); // counter.get() is the method from the map to get the value of the previous counter, then we add 1 to that number, then assigns that result as the new value linked to that key
//        }else {
//            // the map does not contain the letter/char -> which means this is the first time the character was found, so we should add it to the map
//            counter.put(key, 1);
//        }
//
//    }
//    System.out.println(counter);
//}
    static void characterCount(String inputString) {
        // Creating a HashMap containing char
        // as a key and occurrences as  a value
        HashMap<Character, Integer> charCountMap=new HashMap<Character, Integer>();

        // Converting given string to char array

        char[] strArray = inputString.toCharArray();

        // checking each char of strArray
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {

                // If char is present in charCountMap,
                // incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {

                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
        // Printing the charCountMap
        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
    String str ="jjdjdkiexeksksd";
        characterCount(str);
    }
}


