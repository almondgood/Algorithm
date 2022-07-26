import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] map;
    static boolean[][] visited;
    static int n;
    static int m;
    static int cnt = 0;
    static boolean isEnd = false;
    static Queue<int[]> queue = new LinkedList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            char[] charArr = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                map[i][j] = charArr[j] - '0';
            }
        }


        bfs(0, 0);

        System.out.println(map[n -1][m-1]);

    }

    public static void bfs(int y, int x) {
        queue.add(new int[]{y, x});

        while (!queue.isEmpty()) {
            int[] loc = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = loc[1] + dx[i];
                int ny = loc[0] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                    if (map[ny][nx] == 1 && !visited[ny][nx]){
                        visited[ny][nx] = true;
                        queue.add(new int[]{ny, nx});
                        map[ny][nx] = map[loc[0]][loc[1]] + 1;
                    }
                }

            }

        }


    }

}
