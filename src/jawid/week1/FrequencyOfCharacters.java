package jawid.week1;

import java.util.*;

public class FrequencyOfCharacters {
/*
1️⃣ String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
*/
//1.approach
    public static void frequencyOfEachCh(String str){
        Map<Character,Integer> myCounter = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if(myCounter.containsKey(key)){
                myCounter.put(key, myCounter.get(key) + 1);
            }else{
// the map does not contain lwtter/char --> which means this is the first time the character was found, so we should add it to the map
                myCounter.put(key,1);
            }
        }
        System.out.println(myCounter);
    }

    //2.approach
    public static String FrequencyOfCharacters(String word) {

        String result = "";
        String [] str = word.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str));
        for (int i = 0; i < list.size(); i++) {
            int frequency = Collections.frequency(list, list.get(i));
            if (result.contains(list.get(i))) {
                continue;
            }
            result += list.get(i) + frequency;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(FrequencyOfCharacters("AAABBCAAfD"));
    }
// 3.approach
/*
    public static String frequency(String word, char letter){
        int count =0;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter){
                count++;
            }
        }
        return "" + letter + count;
    }

    public static String frequencyWhole(String str){
        String checked = "";
        for (int i = 0; i < str.length(); i++) {
            if(!checked.contains(""+ str.charAt(i))) {
                checked += frequency(str, str.charAt(i));
            }
        }
        return checked;
    }
    public static void main(String[] args) {
        System.out.println(frequencyWhole("AAAaaaaBBBvvvCCCCC"));
    }
 */

    public static boolean Cydeo(String word){
        if(word.startsWith("cyd")){
            return true;
        }
        return false;
    }
}


   /*
   //      characters = RemoveDuplicates.removeDuplicates("AAABBCDD");

    String str = "";

    for (int i = 0; i < characters.length(); i++) {
        int count = 0;

        for (int j = 0; j < characters.length(); j++) {
            if (characters.charAt(j) == characters.charAt(i)) {
                count++;
            }
        }
        if (str.contains("" + characters.charAt(i) + count)){
            continue;
        }
        else {
            str += "" + characters.charAt(i) + count;
        }
    }
    System.out.println(str);
}
    public static void main(String[] args) {
        frequencyOfCharacters("AAABBCDDAF");
    }
}
    */