package zeynep.interview_questions_week2;

public class Q2 {

    /*
    2️⃣ String - Password Validation Task
    Write a return method that can verify if a password is valid or not. Requirements:
    1. Password MUST be at least 6 characters and should not contain space
    2. Password should at least contain one upper case letter
    3. Password should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    6. if all requirements above are met, the method returns true, otherwise returns false
     */

    public static boolean verifyPassword(String str){
        int uperr = 0;
        int lower = 0;
        int special = 0;
        int digit = 0;
        if(str.length() >= 6 && !str.contains(" ")){
            for (int i = 0; i < str.length(); i++) {
                if(Character.isUpperCase(str.charAt(i))){
                    uperr++;
                }else if(Character.isLowerCase(str.charAt(i))){
                    lower++;
                }else if(Character.isDigit(str.charAt(i))){
                    digit++;
                }else{
                    special++;
                }
                if(uperr >= 1 && lower >= 1 && digit >= 1 && special >= 1 ){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(verifyPassword("Zeynep.*91"));
}

}
