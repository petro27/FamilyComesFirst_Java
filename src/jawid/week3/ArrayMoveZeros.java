package jawid.week3;

import java.util.Arrays;

public class ArrayMoveZeros {
/*
5️⃣ Array - Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
*/
public static void moveZerosArr(int [] arr){
    int [] movedZeros = new int[arr.length];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] !=0){
            movedZeros[index] = arr[i];
            index++;
        }

    }
//    for (int each : arr){
//        if (each !=0){
//            movedZeros[index] = each;
//            index++;
//        }
//    }
    System.out.println("Arrays.toString(array) = " + Arrays.toString(arr));
    System.out.println("Arrays.toString(movedZeros) = " + Arrays.toString(movedZeros));

}

    public static void main(String[] args) {
    int [] arr = {1,0,2,0,3,0,4,0};

        moveZerosArr(arr);
    }
}
