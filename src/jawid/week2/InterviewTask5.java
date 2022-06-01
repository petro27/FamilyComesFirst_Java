package jawid.week2;

import java.util.Arrays;

public class InterviewTask5 {
/*
5️⃣ Array - Find Minimum
Write a method that can find the minimum number from an int Array
*/
/*
// 10. find minimum (Mentor answer)
    public static int findMin(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int min = max;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
*/
    public static int minNum(int[] arr){
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
        int [] arr = {5,8,3,98,-1,-2,22, 89, 79};
        System.out.println("minNum(arr) = " + minNum(arr));
    }

}
