import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static Stack<String> stack = new Stack<>();
    static Map<String, ArrayList<String>> map = new HashMap<>();
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");

            map.put(s[0], new ArrayList<>(List.of(s[1], s[2])));
        }


        preorder("A");
        sb.append('\n');

        inorder("A");
        sb.append('\n');

        postorder("A");
        sb.append('\n');

        System.out.println(sb);
    }


    public static void preorder(String start) {
        if (start.equals(".")) return;

        sb.append(start);

        for (int i = 0; i < 2; i++) {
            preorder(map.get(start).get(i));
        }
    }

    public static void inorder(String start) {
        if (start.equals(".")) return;

        stack.add(start);

        for (int i = 0; i < 2; i++) {
            inorder(map.get(start).get(i));

            if (i == 0) {
                sb.append(stack.pop());
            }
        }
    }

    public static void postorder(String start) {
        if (start.equals(".")) return;

        stack.add(start);

        for (int i = 0; i < 2; i++) {
            postorder(map.get(start).get(i));
        }

        sb.append(stack.pop());
    }
}
