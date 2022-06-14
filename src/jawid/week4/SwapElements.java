package jawid.week4;

import java.util.Arrays;

public class SwapElements {
/*
5️⃣  Numbers - Swap Numbers.
*/
public static void swap1(int a, int b){
    int temp;
    temp = a;
    a = b;
    b = temp;
    System.out.println("a = " + a);
    System.out.println("b = " + b);
}

    public static void swap2(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        //this is for the numbers inside of int array
        int [] arr ={1,2};
        int first = arr[0];
        int second = arr[1];

        int temp = arr[0];
        first = arr[1];
        second = temp;
        int [] swap = {first,second};
        System.out.println(Arrays.toString(swap));

        //this is for the int nums
        int firstNum = 5;
        int secondNum = 6;
        System.out.println("Before swapping");
        System.out.println("firstNum = " + firstNum);
        System.out.println("secondNum = " + secondNum);

        int tempNum = firstNum;
        firstNum = secondNum;
        secondNum = tempNum;
        System.out.println("After swapping");
        System.out.println("firstNum = " + firstNum);
        System.out.println("secondNum = " + secondNum);

    }

}
