package jawid;

public class InterviewTask3 {
 /*
3️⃣ String - sum of digits in a string
Write a method that can return the sum of the digits in a string
*/
public static int sumOfDigits(int num1, int num2, int num3 ){
    int sum = num1+num2+num3;
    return sum;
}

    public static void main(String[] args) {
        System.out.println(sumOfDigits(3, 7, 4));
    }
}
