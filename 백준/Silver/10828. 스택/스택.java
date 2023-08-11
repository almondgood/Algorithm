import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push" -> {
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "top" -> {
                    if (stack.size() == 0) sb.append(-1);
                    else sb.append(stack.peek());
                    sb.append("\n");
                }
                case "size" -> sb.append(stack.size()).append("\n");
                case "empty" -> {
                    if (stack.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append("\n");
                }
                case "pop" -> {
                    if (stack.size() == 0) {
                        sb.append(-1);
                    } else {
                        sb.append(stack.pop());
                    }
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}