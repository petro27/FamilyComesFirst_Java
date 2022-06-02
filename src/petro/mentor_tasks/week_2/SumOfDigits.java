package petro.mentor_tasks.week_2;

public class SumOfDigits {

    public static String sumOfDigits(String digit1, String digit2) {

        int dig1 = Integer.parseInt(digit1);
        int dig2 = Integer.parseInt(digit2);
        String str = String.valueOf(dig1+dig2);
        return str;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("-4", "-4"));
    }
}
