package jawid.week2;

public class InterviewTask3 {
 /*
3️⃣ String - sum of digits in a string
Write a method that can return the sum of the digits in a string
*/
/*
// 8. sum of digit in a string (Mentor Answer)
    public static int digitSum(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                result += Character.getNumericValue(str.charAt(i));
            }
        }
        return result;
    }
     */
public static int sumOfDigits(int num1, int num2, int num3 ){
    int sum = num1+num2+num3;
    return sum;
}

    public static void main(String[] args) {
        System.out.println(sumOfDigits(3, 7, 4));
    }
}
