package petro.mentor_tasks.week_3;

import java.util.Arrays;

public class MoveZerosToEnd {
    /*
    Array - Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
     */
    public static int[] moveZeros(int [] numbers) {

        int temp = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                temp = numbers[i + 1];
                temp = numbers[i];
                numbers[i] = temp;
                i = -1;
            }
        }
        int[] res = new int[numbers.length];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0)
                res[index++] = numbers[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeros(new int[]{1,0,-2,0,3,0,-4,0})));

    }
}
