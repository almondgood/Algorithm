import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] arr;

    static boolean[] visited;
    static Queue<Integer> queue = new LinkedList<>();

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());



        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];
        arr = new int[n + 1][n + 1];


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            arr[y][x] = arr[x][y] = 1;
        }

        visited[v] = true;
        dfs(v);

        Arrays.fill(visited, false);
        visited[v] = true;
        sb.append("\n");

        bfs(v);

        System.out.println(sb);


    }

    public static void dfs(int start) {
        sb.append(start).append(" ");


        for (int i = 1; i < arr.length; i++) {
            if (arr[start][i] == 1 && !visited[i]){
                visited[i] = true;
                dfs(i);
            }
        }
    }

    public static void bfs(int start) {
        queue.add(start);
        sb.append(start).append(" ");

        while (!queue.isEmpty()){
            int y = queue.poll();

            for (int i = 1; i < arr.length; i++) {
                if (arr[y][i] == 1 && !visited[i]){
                    visited[i] = true;
                    queue.add(i);
                    sb.append(i).append(" ");
                }
            }
        }
    }
}
