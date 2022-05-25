package petro.mentor.week_2;

import java.util.Scanner;

public class Password {

    public static boolean validPassword(String password) {

        int countUpperLetters = 0; int countLowerLetters = 0; int countDigits = 0; int countSpecialCharacters = 0;

        if (password.length() <= 6 && password.contains(" ")) {
            return false;
        }else {
            for (int i = 0; i < password.length(); i++) {

                if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
                    countUpperLetters++;
                } else if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
                    countLowerLetters++;
                } else if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                    countDigits++;
                } else {
                    countSpecialCharacters++;
                }
            }
        }
        return (countUpperLetters > 0 && countLowerLetters > 0 && countDigits > 0 && countSpecialCharacters > 0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the password:");
        while (!validPassword(scan.nextLine())) {
            System.out.println("The password entered is invalid");
            System.out.println("Enter valid password: ");
        }

        System.out.println("Confirm the password:");
        String confirmPassword = scan.nextLine();
        while (!validPassword(confirmPassword)) {
            System.out.println("The confirmation password doesn't match");
            System.out.println("Confirm the password again:");
            confirmPassword = scan.nextLine();
        } if (validPassword(confirmPassword)) System.out.println(true);
    }
}
