import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    static int[] DP = new int[11];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        DP[1] = 1;
        DP[2] = 2;
        DP[3] = 4;

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());

            sb.append(dp(n)).append('\n');
        }

        System.out.println(sb);
    }

    public static int dp(int n) {
        if (n < 4) {
            return DP[n];
        }

        DP[n] = dp(n-1) + dp(n-2) + dp(n - 3);
        return DP[n];
    }
}