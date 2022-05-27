package jawid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InterviewTask1 {
    /*
1️⃣ String - Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
sort the individual string and append them back together.
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
     */
    public static void main(String[] args) {
        String str = "DC501GCCCA098911";
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> lAndDTogether = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            if (Character.isAlphabetic(str.charAt(i))) {
                lAndDTogether.addAll(digits);
                digits.clear();
                letters.add(str.charAt(i));
                Collections.sort(letters);
            } else if (Character.isDigit(str.charAt(i))) {
                lAndDTogether.addAll(letters);
                letters.clear();
                digits.add(str.charAt(i));
                Collections.sort(digits);
            }
        }
       if (letters.isEmpty() ? lAndDTogether.addAll(digits) : lAndDTogether.addAll(letters));
        System.out.println(lAndDTogether.toString()
                .replace(", ", "")
                .replace("[", "")
                .replace("]", ""));
    }
    }

