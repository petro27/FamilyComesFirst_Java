package jawid;
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
public class InterviewTask2 {
 public static boolean passwordValidation(String password){
//1. Password MUST be at least 6 characters and should not contain space
  if (password.length() >= 6 && !password.contains(" ")){
   return true;
  }
//2. Password should at least contain one upper case letter
  if (true) {
   int countUppercase = 0;
   for (char i = 'A'; i <= 'Z'; i++) {
    String str1 = Character.toString(i);
    if (password.contains(str1)) {
     countUppercase = 1;
    }
   }
   if(countUppercase == 0){
    return false;
   }
  }
// 3. Password should at least contain one lowercase letter
  if (true) {
   int countLowercase = 0;
   for (char i = 'a'; i <= 'z'; i++) {
    String str1 = Character.toString(i);
    if (password.contains(str1)) {
     countLowercase = 1;
    }
   }
   if(countLowercase == 0){
    return false;
   }
  }
// 4. Password should at least contain one special characters
  if (true){
   int countSpecialChar = 0;
   for (int i = 0; i < password.length(); i++) {
    // casting int to char
    char ch = (char) i;
    String str = Character.toString(ch);
    if (password.contains(str)){
     countSpecialChar = 1;
    }
   }
   if (countSpecialChar == 0){
    return false;
   }
  }
// 5. Password should at least contain a digit
  if (true) {
   int countDigits = 0;
   for (int i = 0; i <= 9; i++) {
    String str1 = Integer.toString(i);
    if (password.contains(str1)) {
     countDigits = 1;
    }
   }

   if(countDigits == 0){
    return false;
   }
  }
  return true;
 }

 public static void main(String[] args) {
  System.out.println(passwordValidation("Sc#1ja89"));
 }
}