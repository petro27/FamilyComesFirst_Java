package zeynep.interview_questions_week3;

import java.util.Arrays;

public class IQ2 {
    /*
    2️⃣ Array - Sort Descending
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex:  int[] arr = {10,20,7, 8, 90};
         arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
     */
    public static String sortDescending(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmpMin = 0;
                if (arr[i] < arr[j]) {
                    tmpMin = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmpMin;
                }
            }
        }

        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        int[] ar = { -1,-5,-3,-6,-8,-15,-14,-89,-5669 };

        System.out.println(sortDescending(ar));
    }

}
