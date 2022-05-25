package zeynep.interview_questions_week1;

import java.util.Arrays;

public class H2 {
    /*
    2️⃣ String - Same letters
    Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
         same("abc",  "abb"); -> false:
     */

    public static boolean sameLetters(String str, String str2){
        char [] firstW = str.toCharArray();
        char [] secondW = str2.toCharArray();
        Arrays.sort(firstW);
        Arrays.sort(secondW);
        return Arrays.equals(firstW,secondW);
    }

    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "bbb"));
    }
}
