package zeynep.interview_questions_week4;

public class Qu3 {
    /*
    3️⃣ Numbers - Divide without / operator
    Write a method that can divide two numbers without using division operator

     */
//    public static void divideNum(int num1,int num2) {
//
//        int count = 0;
//        if (num1 == 0) {
//            count = 0;
//            System.out.println(count);
//        } else if (num1 > 0 && num2 > 0) {
//            while (num1 > 1 ) {
//                num1 = num1 - num2;
//                count++;
//            }
//            System.out.println(count);
//        } else if (num1 < 0 && num2 < 0) {
//            while (num1 < 0) {
//                num1 = num1 - num2;
//                count++;
//            }
//            System.out.println(count);
//        } else if (num1 < 0 && num2 > 0) {
//            while (num1 < 0) {
//                num1 = num1 + num2;
//                count++;
//            }
//            System.out.println(count);
//        } else if (num1 > 0 && num2 < 0) {
//            while (num1 > 0) {
//                num1 = num1 + num2;
//                count++;
//            }
//            System.out.println(count);
//        }
//    }
//
//
//    public static void main(String[] args) {
//        divideNum(0,5);
//        divideNum(0,-6);
//        divideNum(160,7);
//        divideNum(-150,5);
//        divideNum(48,4);
//
//    }



    public static int divideNum(int num1, int num2) {
        if (num1 == 0) {
            return 0;
        }
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }

        boolean negResult = false;

        if (num1 < 0) {             // -13
            num1 = -num1;           //  13
            if (num2 < 0) {         //  -2
                num2 = -num2;       //  2
            } else {                //  num1 = -13 num2 = 2
                negResult = true;   // negative result
            }
        } else if (num2 < 0) {      //num1 = 13 num2 = -2
            num2 = -num2;           // num2 = 2
            negResult = true;       //negative result
        }

        int count = 0;
        while (num1 >= num2) {
            num1 = num1 - num2;     // 13 - 2 = 11
            count++;
        }
        if (negResult) {
            count = -count;
        }
        return count;
    }

    public static void main (String[] args) {
        int num1 = -150, num2 = 4 ;
        System.out.println( divideNum(num1, num2));

    }

}
