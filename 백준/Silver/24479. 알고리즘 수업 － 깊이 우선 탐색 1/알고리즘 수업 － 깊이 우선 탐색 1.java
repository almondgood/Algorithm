import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
//    static int[][] tree;

    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

    static int[] visitedCnt;
    static int cnt = 1;
    static int n;


    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

//        tree = new int[n + 1][n + 1];
        visitedCnt = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int node = Integer.parseInt(st.nextToken());
            int leaf = Integer.parseInt(st.nextToken());

//            tree[node][leaf] = tree[leaf][node] = 1;

            arr.get(node).add(leaf);
            arr.get(leaf).add(node);
        }

        for (int i = 0; i < n; i++) {
            if (!arr.get(i).isEmpty()){
                arr.get(i).sort(Integer::compareTo);
            }
        }

        dfs(r);

        for (int i = 1; i <= n; i++) {
            sb.append(visitedCnt[i]).append('\n');
        }

        System.out.println(sb);

    }

    public static void dfs(int start){
        visitedCnt[start] = cnt++;

        int size = arr.get(start).size();

        for (int i = 0; i < size; i++) {
            int num = arr.get(start).get(i);
            if (visitedCnt[num] == 0) {
                dfs(num);
            }
        }
    }
}
