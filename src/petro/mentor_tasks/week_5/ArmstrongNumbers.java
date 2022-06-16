package petro.mentor_tasks.week_5;

public class ArmstrongNumbers {
    //Numbers - Armstrong numbers
    //Write a method that can check if a number is Armstrong  number
    public static String isArmstrong(int num) {

        String res = "" + num;
        int sum = 0;
        int multiply = 1;
        int[] parse = new int[res.length()];
        for (int i = 0; i < parse.length; i++) {
            parse[i] = Integer.parseInt(res.charAt(i) + "");
            for (int j = 0; j < parse.length; j++) {
                multiply *= parse[i];
            }
            sum += multiply;
            multiply = 1;
        }

       return (num == sum) ? num + " is Armstrong" : num + " is not Armstrong";

    }

      public static void main(String[] args) {
            isArmstrong(2);
        }
    }

