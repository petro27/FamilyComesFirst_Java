package petro.mentor_tasks.week_5;

public class PrimeNumber {
    //Numbers - Prime Number
    //Write a method that can check if a number is prime or not

    public static String isPrime(int num){

        String result;
        boolean flag = false;
        for (int i = 2; i <= num/2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            result=num + " is a prime number.";
        else
            result=num + " is not a prime number.";

        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(23));
    }
}
