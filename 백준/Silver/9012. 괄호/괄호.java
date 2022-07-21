import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());



        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            char[] arr = br.readLine().toCharArray();


            for (char item : arr) {
                if (item == '(') {
                    stack.push(item);
                } else {
                    if (stack.isEmpty()) {
                        stack.push(item);
                        break;
                    } else stack.pop();
                }
            }

            if (stack.isEmpty()) {
                sb.append("YES");
            } else sb.append("NO");

            sb.append('\n');
        }

        System.out.println(sb);
    }
}
