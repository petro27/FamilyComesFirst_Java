package petro.mentor_tasks.week_2;

import java.util.ArrayList;
import java.util.Collections;

public class SortString {
    /*
    String - Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together. Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
   */
    public static void main(String[] args) {

        String input = "DC501GCCCA098911SKBH983";

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {

            if (Character.isAlphabetic(input.charAt(i))) {
                list.addAll(digits);
                digits.clear();
                letters.add(input.charAt(i));
                Collections.sort(letters);
            } else if (Character.isDigit(input.charAt(i))) {
                list.addAll(letters);
                letters.clear();
                digits.add(input.charAt(i));
                Collections.sort(digits);
            }
        }
        if (letters.isEmpty() ? list.addAll(digits) : list.addAll(letters)) ;
        System.out.println(list.toString()
                .replace(", ", "")
                .replace("[", "")
                .replace("]", ""));
    }
}
