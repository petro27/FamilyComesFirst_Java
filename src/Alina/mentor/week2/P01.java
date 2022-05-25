package Alina.mentor.week2;

import java.util.Arrays;

public class P01 {

    /*
    1 String - Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together. Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
*/
    public static void main(String[] args) {
        String str = "DC501GCCCA098911";
        String arrayToString = "";
        String result = "";

        String[] letter2 = str.split("");
        Arrays.sort(letter2);


        for (int i = 0; i < str.length(); i++) {

            char letter = arrayToString.charAt(i);
            if (letter >= 'A' && letter <= 'Z') {
                result += letter;

            }
        }

        System.out.println(result);
    }
    }
