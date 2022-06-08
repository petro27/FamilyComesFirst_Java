package petro.mentor_tasks.week_4;

public class DivideWithoutOperator {

    //Numbers - Divide without / operator
    //Write a method that can divide two numbers without using division operator

    public static String divideNumbers(int num1, int num2) {
        int count=0;
        if (num2 != 0) {
            if (num1 != 0) {
                if (num1 >= num2) {
                    while (num1!=0){
                        num1-=num2;
                        count++;
                    }
                }
            } else System.out.println(num1 + " / " + num2 + " = 0");
        } else System.out.println("Error! Divisor can't be 0");
        return num2*count + " / " + num2 + " = "+count;
    }

    public static void main(String[] args) {
        System.out.println(divideNumbers(12, 3));
    }
}
