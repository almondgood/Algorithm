import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static boolean[][] visited;
    static int cnt = 0;
    static int m;
    static int n;
    static int k;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
             m = Integer.parseInt(st.nextToken());
             n = Integer.parseInt(st.nextToken());
             k = Integer.parseInt(st.nextToken());
            map = new int[n][m];
            visited = new boolean[n][m];
            cnt = 0;

            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map[y][x] = 1;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        dfs(j, i);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);

        }

    }

    public static void dfs(int x, int y){
        visited[y][x] = true;

        if (x < m - 1 && map[y][x + 1] == 1 && !visited[y][x+1]) {
            dfs(x + 1, y);
        }
        if (y < n - 1 && map[y + 1][x] == 1 && !visited[y+1][x]) {
            dfs(x, y + 1);
        }
        if (x > 0 && map[y][x - 1] == 1 && !visited[y][x-1]) {
            dfs(x - 1, y);
        }
        if (y > 0 && map[y - 1][x] == 1 && !visited[y - 1][x]) {
            dfs(x, y - 1);
        }
    }
}
