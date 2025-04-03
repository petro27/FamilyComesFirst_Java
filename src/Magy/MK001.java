package Magy;

import java.util.Scanner;

public class MK001 {
    public static void main(String[] args) {

        /*Print Numbers 1 to 100: The program should iterate through numbers from 1 to 100, inclusive.
          Divisibility by 3: If a number is divisible by 3, print "Fizz" instead of the number.
          Divisibility by 5: If a number is divisible by 5, print "Buzz" instead of the number.
          Divisibility by both 3 and 5: If a number is divisible by both 3 and 5, print "FizzBuzz" instead of the number.
          Example:  */
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number to find the divisibility");
        int num = input.nextInt();

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("fizz buzz");
        } else if (num % 3 == 0) {
            System.out.println("fizz");
        } else if (num % 5 == 0) {
            System.out.println("buzz");
        }else {
            System.out.println("that number is nut evenly divisible");
        }
    }
}
