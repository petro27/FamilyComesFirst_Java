package petro.mentor_tasks.week_4;

public class OddAndEven {
    /*
    Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
     */
    public static String identifyNumber(int num){

        String identifier;
        if (num%2==0){
            identifier="even";
        }else {
            identifier="odd";
        }
        return identifier;
    }
    public static void main(String[] args) {
        System.out.println(identifyNumber(2));
    }
}
