package jawid.week4;

public class OddAndEven {
/*
️2️⃣ Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
     */
public static String identifyEvenOdd(int num) {
    if (num % 2 == 0) {
        return "Even";
    }
    return "Odd";
}

    public static void main(String[] args) {
        System.out.println(identifyEvenOdd(-26));

    }
}
