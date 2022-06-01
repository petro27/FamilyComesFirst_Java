package zeynep.interview_questions_week2;

public class Q4 {
  /*
    4️⃣ Array - Find Maximum
    Write a method that can find the maximum number from an int Array
         */

    public static int findMax(int [] ar){
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] > max){
                max = ar[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] nums = {1,0,5,8,7,-9,4};
        System.out.println(findMax(nums));
    }//
}
