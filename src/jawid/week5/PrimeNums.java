package jawid.week5;

public class PrimeNums {
    /*
️2️⃣ Numbers - Armstrong numbers
Write a method that can check if a number is Armstrong  number
     */
    public static boolean isPrime(int num){

        if(num == 0 || num ==1){
            return false;
        }
        for (int i = 2; i < num ; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(isPrime(1));
    }
}
