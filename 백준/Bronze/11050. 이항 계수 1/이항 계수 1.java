import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] comb = new int[11][11];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= n; i++) {
            comb[i][0] = 1;
            comb[i][i] = 1;
        }

        System.out.println(comb(n, k));
    }

    static int comb(int n, int k) {
        if (k == 0 || n == k) {
            return comb[n][k];
        }
        return comb[n][k] = comb(n - 1, k) + comb(n - 1, k - 1);
    }
}