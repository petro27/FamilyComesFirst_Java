package petro.mentor.week_1;

class RemoveDuplicates {
    /*
    String - Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC
     */

    public static String removeDuplicates(String str) {

        String removeDup = "";

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) != str.charAt(i +1)) {
                removeDup += str.charAt(i);
            }
        }

        return removeDup+str.substring(str.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));
    }
}
