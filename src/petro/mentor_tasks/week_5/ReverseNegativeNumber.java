package petro.mentor_tasks.week_5;

public class ReverseNegativeNumber {
    //Number - Reverse negative number
    //Write a return method that can reverse negative number and return it as int

    public static int reverseNegativeNumber(int num) {
        int result = 0;

        if (num < 0) {
            String str = String.valueOf(num);
            String reversed = "";
            for (int i = 1; i < str.length(); i++) {
                reversed = str.charAt(i) + reversed;
            }
            result = Integer.parseInt(reversed);
        } else {
            result = num;
        }
        return -result;
    }

    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(0));
    }
}
