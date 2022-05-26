package jawid;

import java.util.Scanner;

public class InterviewTask4 {
/*
4️⃣ Array - Find Maximum
Write a method that can find the maximum number from an int Array
 */
public static int maxNum(int[] arr) {
    int max = 0;
    for (int each : arr) {
        if (max <= each) {
            max = each;
        }
    }
    return max;
}

    public static int minNum(int[] arr) {
        int min = 0;
        for (int each : arr) {
            if (min >= each) {
                min = each;
            }
        }
        return min;
    }

    public static void main(String[] args) {
    int [] array = {5,7,9,5,3,12,8,88,-12, 56, 87};
        System.out.println("maxNum(array) = " + maxNum(array));
        System.out.println("minNum(array) = " + minNum(array));


    }
}
