package aysenur;

import java.util.Arrays;

public class SortLettersAndNumbers {
    //String - Sort Letters and Numbers from alphanumeric String
    //Given alphanumeric String, we need to split the string into substrings of
    // consecutive letters or numbers, sort the individual string and append them back together.
    //Ex:Input:  "DC501GCCCA098911"
    //OutPut: "CD015ACCCG011899"

    static void sortString(String str) {
        char [] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }

    // Driver program to test above function
    public static void main(String[] args) {
        String s = "DC501GCCCA098911";
        sortString(s);
    }
}

