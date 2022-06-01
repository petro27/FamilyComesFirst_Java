package zeynep.interview_questions_week1;

public class H5 {
    /*
        5️⃣ String - Reverse
    Write a return method that can reverse String
    Ex: Reverse("ABCD"); ==> DCBA
     */

    //Approach 1
    public static String reverseStr(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    //Approach 2
    public static String reverse(String str){
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("Zeynep"));
        System.out.println(reverse("Zeynep"));

    }
}
