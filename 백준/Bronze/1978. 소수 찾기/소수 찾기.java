import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st =  new StringTokenizer(br.readLine());
        
        boolean[] prime = new boolean[1001];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        
        for (int i = 2; i < 1001; i++) {
            for (int j = 2; i * j < 1001; j++) {
                prime[i * j] = false;
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (prime[Integer.parseInt(st.nextToken())]) 
                answer++;
        }

        System.out.println(answer);
        
    }
}
