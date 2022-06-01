package jawid.week3;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortingD {
/*
️2️⃣ Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
     */
    public static int [] sortArrayD(int [] arr){

        // Descending sort
        Arrays.sort(arr);
//        int[] arraySortD = new int[arr.length];
//        for(int i = arr.length-1; i >0; i--) {
//            arraySortD[i] = arr[(arr.length-1)-i];
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] >= arr[j]){
                    int nums = arr[i];
                    arr[i] = arr[j];
                    arr[j] = nums;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,7, 67,-4,-12,6,1289,190, 127,90, 0, 8, 90};
        System.out.println(Arrays.toString(sortArrayD(arr)));
    }


}
