package petro.mentor_tasks.week_3;

import java.util.Arrays;

public class SortDescending {
    /*
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr =        {10,-20,-7, -8, 90};
 arr = Sort(arr);  ==>  {90, 20, 10, 8, -7};
     */
    public static int[] SortDescending(int[] nums) {

        int[] sorted = new int[nums.length];
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            int index = 0;
            for (int k = 0; k < nums.length && i == 0; k++)
                if (nums[k] < min)min = nums[k];
            for (int g = 0; g < nums.length&&i==0; g++)sorted[g] = min;
            for (int j = 0; j < nums.length; j++) {
                if (sorted[i] < nums[j]) {
                    sorted[i] = nums[j];
                    index = j;
                }
            }
            nums[index] = min;
        }
        return sorted;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(SortDescending(new int[]{10,-20,-7, -8, 90})));
    }
}
