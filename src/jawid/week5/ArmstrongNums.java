package jawid.week5;

public class ArmstrongNums {
/*
3️⃣Numbers - Armstrong numbers
Write a method that can check if a number is Armstrong  number
     */
public static boolean isArmstrong( int num ){
    String str = String.valueOf(num); // 371     "371"
    String [] arr = str.split("");  // 3,7,1
    int result = 0;

    for (int i = 0; i < arr.length; i++) {
        int numbers = Integer.parseInt(arr[i]);  // 3 7 1
        result += numbers*numbers*numbers;
    }
    if(result == num){
        return true;
    }
    return false;
}

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
    // 153, 370, 371, 407
}
