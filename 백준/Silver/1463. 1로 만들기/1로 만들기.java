import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static boolean end = false;
    static long[] dpArr = new long[10000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Arrays.fill(dpArr, Integer.MAX_VALUE);

        dpArr[1] = 0;
        dpArr[2] = 1;
        dpArr[3] = 1;

        dp(n);

        System.out.println(dpArr[n]);
    }


    public static long dp(int n) {
        if (dpArr[n] < Integer.MAX_VALUE) {
            return dpArr[n];
        }

        long sumA = Integer.MAX_VALUE;
        long sumB = Integer.MAX_VALUE;
        long sumC = Integer.MAX_VALUE;

        if (n % 3 == 0) {
            sumA = dp(n / 3) + 1;
        }
        if (n % 2 == 0) {
            sumB = dp(n / 2) + 1;
        }
        sumC = dp(n - 1) + 1;

        long sum = Math.min(sumA, sumB);
        sum = Math.min(sum, sumC);


        dpArr[n] = Math.min(dpArr[n], sum);

        return sum;
    }
}
