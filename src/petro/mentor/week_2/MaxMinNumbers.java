package petro.mentor.week_2;

import java.util.Scanner;

public class MaxMinNumbers {

    public static int maxNumber(int[] numbers) {
        int max = 0;
        for (int each : numbers) {
            if (numbers[0] <= each) {
                max = each;
            }
        }
        return max;
    }

    public static int minNumber(int[] numbers) {
        int min = 0;
        for (int each : numbers) {
            if (numbers[0] >= each) {
                min = each;
            }
        }
        return min;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Maximum number: "+ maxNumber(array));
        System.out.println("Minimum number: "+ minNumber(array));


    }
}
