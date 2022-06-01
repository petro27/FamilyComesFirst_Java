package jawid.week2;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewTask4 {
    /*
    4️⃣ Array - Find Maximum
    Write a method that can find the maximum number from an int Array
     */
/*
// 9. find maximum (Mentor Answer)
    public static int findMax(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
     */
    public static int maxNum(int[] arr) {
        // shorter method from Karim our group member
//        Arrays.sort(arr);
//        return arr[arr.length-1];

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int nums = arr[i];
            if (nums > max) {
                max = nums;
            }
        }
        return max;
    }

    public static int minNum(int[] arr) {
        // shorter method from Karim our group member
//        Arrays.sort(arr);
//        return arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int nums = arr[i];
            if (nums < min) {
                min = nums;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr = {55,23,24,66,2,1,7,90};
        System.out.println("maxNum(arr) = " + maxNum(arr));
        System.out.println("minNum(arr) = " + minNum(arr));
    }
}
