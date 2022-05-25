package petro.mentor.week_1;

public class FrequencyOfCharacter {
    /*
    String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void frequencyOfCharacters(String characters) {

//      characters = RemoveDuplicates.removeDuplicates("AAABBCDD");

        String str = "";

        for (int i = 0; i < characters.length(); i++) {
            int count = 0;

            for (int j = 0; j < characters.length(); j++) {
                if (characters.charAt(j) == characters.charAt(i)) {
                    count++;
                }
            }
            if (str.contains("" + characters.charAt(i) + count)){
                continue;
            }
            else {
                str += "" + characters.charAt(i) + count;
            }
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        frequencyOfCharacters("AAABBCDDAF");

    }
}
