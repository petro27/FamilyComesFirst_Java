package jawid;

public class InterviewTask5 {
/*
5️⃣ Array - Find Minimum
Write a method that can find the minimum number from an int Array
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
        int [] arr = {5,8,3,98,22, 89, 79};
        System.out.println("minNum(arr) = " + minNum(arr));
    }

}
