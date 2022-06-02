package zeynep.interview_questions_week3;

import java.util.Arrays;

public class IQ1 {
     /*
    1️⃣ Array - Sort Ascending
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex:
    int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};

     */

    public static int[] sortAscending(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                int tmpMax = 0;
                if (arr[i] > arr[j]) {
                    tmpMax = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmpMax;
                }
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        int[] ar = { 5, 1,3,5669, 6,8,15,14,89 };
        System.out.println(Arrays.toString(sortAscending(ar)));
    }

}
