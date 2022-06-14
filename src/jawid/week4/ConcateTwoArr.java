package jawid.week4;

import java.util.Arrays;

public class ConcateTwoArr {
/*
1️⃣ Array - Concat two arrays
Write a return method that can concate two arrays
*/
public static int[] concatArray(int [] arr, int[] arr2){

    int [] arr3 = Arrays.copyOf(arr,arr2.length+arr.length);
    int element = arr.length;
    for (int each: arr2) {
        arr3[element] = each;
        element++;
    }
    return arr3;
}

    public static void main(String[] args) {

        int [] arr = {0,1,2,3,4,5};
        int [] arr2 ={6,7,8,9,10,11,12};
        System.out.println(Arrays.toString(concatArray(arr,arr2)));
    }
}
