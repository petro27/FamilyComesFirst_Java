package zeynep.interview_questions_week5;

import java.util.Arrays;
import java.util.Collections;

public class Ques3 {
    /*
      3️⃣ Numbers - Armstrong numbers
    Write a method that can check if a number is Armstrong  number

    An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.
    For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.

     */

    public static boolean isArmstrong( int num ){
        String str = String.valueOf(num); // 371     "371"
        String [] arr = str.split("");  // 3,7,1
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            int numbers = Integer.parseInt(arr[i]);  // 3 7 1
            result += numbers*numbers*numbers;
        }
        if(result == num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
        // 153, 370, 371, 407
}
