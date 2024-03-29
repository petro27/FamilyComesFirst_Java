package zeynep.interview_questions_week5;

public class Ques2 {
    /*
     2️⃣ Numbers - Prime Number
    Write a method that can check if a number is prime or not
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
/*
1 to 100 25 prime numbers	2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
101-200	 21 prime numbers	101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199
201-300	 16 prime numbers	211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293
301-400	 16 prime numbers	307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397
401-500	 17 prime numbers	401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499
501-600	 14 prime numbers	503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599
601-700  16 prime numbers	601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691
701-800	 14 prime numbers	701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797
801-900	 15 prime numbers	809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887
901-1000 14 prime numbers	907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997
 */
