package zeynep.interview_questions_week2;

public class Q5 {
    /*
       5️⃣ Array - Find Minimum
       Write a method that can find the minimum number from an int Array
        */
    public static int findMin(int [] ar){
        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] < min){
                min = ar[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] nums = {1,0,5,8,7,-9,4};
        System.out.println(findMin(nums));
    }
}
