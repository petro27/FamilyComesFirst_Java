package petro.mentor_tasks.week_4;

public class FinRa {
    /*
    Numbers - FINRA
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    public static String finOrRa(int num) {

        String flag = "";
        if (num <= 30) {
            if (num % 3 == 0 && num % 5 == 0) {
                flag = "FINRA";
            } else if (num % 3 == 0) {
                flag = "FIN";
            } else if (num % 5 == 0) {
                flag = "RA";
            } else {
                flag = String.valueOf(num);
            }
        } else {
            System.out.println("Number must be less or equal of 30");
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(finOrRa(45));
    }
}
