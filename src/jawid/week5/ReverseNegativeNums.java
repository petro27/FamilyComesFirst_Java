package jawid.week5;

public class ReverseNegativeNums {
/*
4️⃣Number - Reverse negative number
Write a return method that can reverse negative number and return it as int
*/
public static int reverseNeg(int num){
    if(num <0){
        num = -num;
        String str = String.valueOf(num);
        String [] arr = str.split("");

        String result = "";
        for (int i = arr.length-1; i >= 0; i--) {
            result += arr[i];
        }
        int reverseNum = -(Integer.parseInt(result));
        return reverseNum;
    }
    return 0;
}

    public static void main(String[] args) {
        System.out.println(reverseNeg(-6958));
    }

}
