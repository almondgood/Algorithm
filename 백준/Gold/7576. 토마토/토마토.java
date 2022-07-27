import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int m;
    static int n;

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int[][] map;
    static ArrayList<Queue<int[]>> arr = new ArrayList<>();

    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        map = new int[n][m];

        boolean ripen = true;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 0) ripen = false;
            }
        }

        if (ripen){
            System.out.println(0);
            return;
        }

        Queue<int[]> tomatoLoc = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1) {
                    tomatoLoc.add(new int[]{i, j});
                }
            }
        }
        arr.add(tomatoLoc);

        for (int i = 0; i < arr.size(); i++) {
            tomatoLoc = new LinkedList<>();

            while (!arr.get(i).isEmpty()) {
                int[] loc = arr.get(i).poll();

                bfs(loc, tomatoLoc);
            }

            if (!tomatoLoc.isEmpty()) {
                arr.add(tomatoLoc);
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(arr.size() - 1);
    }

    public static void bfs(int[] loc, Queue<int[]> tomatoLoc) {

        for (int i = 0; i < 4; i++) {
            int nx = loc[1] + dx[i];
            int ny = loc[0] + dy[i];

            if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                if (map[ny][nx] == 0) {
                    map[ny][nx] = 1;
                    tomatoLoc.add(new int[]{ny, nx});
                }
            }
        }
    }
}
