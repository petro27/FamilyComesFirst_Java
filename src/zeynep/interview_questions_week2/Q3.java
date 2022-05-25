package zeynep.interview_questions_week2;

public class Q3 {
     /*
    3️⃣ String - sum of digits in a string
    Write a method that can return the sum of the digits in a string

     */

    public static int sumOfDigits(String str){

        int sum =0;

        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))){
                int digit = Integer.parseInt(str.substring(i,i+1)); // ""+str.charAt(i)
                sum += digit;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of digits in the string: " +sumOfDigits("4fgdfg589"));
    }
}
