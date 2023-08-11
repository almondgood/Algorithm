import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Deque<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push_front" -> {
                    queue.addFirst(Integer.parseInt(st.nextToken()));
                }
                case "push_back" -> {
                    queue.addLast(Integer.parseInt(st.nextToken()));
                }
                case "front" -> {
                    if (queue.size() == 0) sb.append(-1);
                    else sb.append(queue.getFirst());
                    sb.append("\n");
                }
                case "back" -> {
                    if (queue.size() == 0) sb.append(-1);
                    else sb.append(queue.getLast());
                    sb.append("\n");
                }
                case "size" -> sb.append(queue.size()).append("\n");
                case "empty" -> {
                    if (queue.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append("\n");
                }
                case "pop_front" -> {
                    if (queue.size() == 0) {
                        sb.append(-1);
                    } else {
                        sb.append(queue.removeFirst());
                    }
                    sb.append("\n");
                }
                case "pop_back" -> {
                    if (queue.size() == 0) {
                        sb.append(-1);
                    } else {
                        sb.append(queue.removeLast());
                    }
                    sb.append("\n");
                }
            }

        }
        System.out.println(sb);
    }
}
