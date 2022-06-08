package petro.mentor_tasks.week_4;

import java.util.Arrays;

public class ConcatArrays {

    //Array - Concat two arrays
    //Write a return method that can concate two arrays
    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length ; i++) {
           arr3[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr3.length-arr2.length+i]=arr2[i];
        }
        return arr3;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatTwoArrays(new int[]{1}, new int[]{2,3,4})));

    }
}
