package zeynep.interview_questions_week3;

import java.util.Arrays;

public class IQ5 {
    /*

    5️⃣ Array - Move Zeros to the End
    Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static int[] moveZeros(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tmpMax = 0;
                    if (arr[i] == 0) {
                        tmpMax = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmpMax;
                }

            }

        }
        return arr;
        }

    public static void main(String[] args) {
        int[] ar = { 5,0, -1,0,3,-5669, 6,-8,15,14,89, 0};
        System.out.println(Arrays.toString(moveZeros(ar)));
    }





}
