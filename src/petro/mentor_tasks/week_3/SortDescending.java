package petro.mentor_tasks.week_3;

import java.util.Scanner;

public class SortDescending {
    /*
    Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:        int[] arr = {10, 20, 7, 8, 90};
arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
     */
    public static int[] sortArray(int size) {
        int[] arr = new int[size];
        return arr;
        }






    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int[] size = sortArray(scan.nextInt());
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size.length; i++) {
            size[i] = scan.nextInt();
        }

    }
}
