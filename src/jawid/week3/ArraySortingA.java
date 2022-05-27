package jawid.week3;

import java.util.Arrays;

public class ArraySortingA {
/*
1️⃣Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
*/
    public static int [] arrayAcSorting(int [] arr){
        Arrays.sort(arr);

        return arr;
    }

    public static void main(String[] args) {
        int [] array = {10, 9, 8, 7};
        System.out.println(Arrays.toString(arrayAcSorting(array)));
    }

}
