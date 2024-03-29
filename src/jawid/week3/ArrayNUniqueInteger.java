package jawid.week3;

import java.util.Arrays;

public class ArrayNUniqueInteger {
/*
3️⃣Array - N unique integers that sum up to 0
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
*/
    public static int [] sumZero(int n){
        int[] sumUpt0Zero = new int[n];
        int index = 0;
        if (n % 2 == 1) {

            sumUpt0Zero[index++] = 0;
            n /= 2;
            for (int i = 1; i <= n; i++) {
                sumUpt0Zero[index++] = i;
                sumUpt0Zero[index++] = -i;
            }
        }
        Arrays.sort(sumUpt0Zero);
        return sumUpt0Zero;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.toString(sumZero(n)));


    }
}
