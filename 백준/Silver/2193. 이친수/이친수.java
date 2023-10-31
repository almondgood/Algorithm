import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[] arr = new long[91];
    public static long pibo(int n) {
        if (arr[n] != 0) {
            return arr[n];
        }

        arr[n] = pibo(n - 1) + pibo(n - 2);

        return arr[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr[1] = 1;
        arr[2] = 1;

        System.out.println(pibo(n));
    }
}