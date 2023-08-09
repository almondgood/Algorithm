import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int compareTo(String x, String y) {
        if (x.length() == y.length()) {
            return x.compareTo(y);
        } else if (x.length() > y.length()) {
            return 1;
        } else return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        Queue<String> q = new PriorityQueue<>(Main::compareTo);

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        q.addAll(set);

        for (int i = 0; i < set.size(); i++) {
            System.out.println(q.remove());
        }

    }
}