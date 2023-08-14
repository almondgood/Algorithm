import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (!map.containsKey(x))
                map.put(x, new ArrayList<>());

            map.get(x).add(y);
        }

        Integer[] keyArr = map.keySet().stream()
                .sorted()
                .toArray(Integer[]::new);

        for (Integer i : keyArr) {
            List<Integer> list = map.get(i);
            Collections.sort(list);

            for (Integer val : list) {
                sb.append(i).append(" ").append(val).append("\n");
            }
        }

        System.out.println(sb);
    }
}