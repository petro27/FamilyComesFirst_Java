package zeynep.interview_questions_week1;

import java.util.Arrays;
import java.util.HashSet;

public class H3 {
     /*
     3️⃣ String - Remove Duplicates
    Write a return method that can remove the duplicated values from String
    Ex:  removeDup("AAABBBCCC") ==> ABC
     */

    public static String removeDuplicate(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains("" + str.charAt(i))){
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static String removeDuplicate2(String str){
        return new HashSet<>(Arrays.asList(str.split("")))
                .toString()
                .replace(", ", "")
                .replace("[", "")
                .replace("]", "");
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicate("AAABBBCCC"));
        System.out.println(removeDuplicate2("AAABBBCCC"));
    }
}
