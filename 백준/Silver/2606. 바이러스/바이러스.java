import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void clear() {
        Arrays.fill(isConnect, false);
        isConnect[1] = true;
        cnt = 0;
        queue.clear();
        stack.clear();
    }
    static Stack<Integer> stack = new Stack<>();
    static Queue<Integer> queue = new LinkedList<>();
    static int n;
    static int connect;
    static boolean[] isConnect;


    // 인접 리스트
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    // 인접 행렬
    static int[][] arr;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        connect = Integer.parseInt(br.readLine());

        // 초기화
        isConnect = new boolean[n + 1];
        arr = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }
        isConnect[1] = true;

        // 입력, 매핑
        for (int i = 0; i < connect; i++) {
            String[] s = br.readLine().split(" ");
            int n1 = Integer.parseInt(s[0]);
            int n2 = Integer.parseInt(s[1]);

            list.get(n1).add(n2);
            list.get(n2).add(n1);
            arr[n1][n2] = arr[n2][n1] = 1;
        }

//        { // 인접 리스트 dfs
//            dfsList(1);
//            System.out.println(cnt);
//
//            clear();
//        }

        { // 인접 행렬 dfs
            dfsArr(1);
            System.out.println(cnt);

            clear();
        }
//
//        { // 인접 리스트 bfs
//            bfsList(1);
//            System.out.println(cnt);
//
//            clear();
//        }
//
//        { // 인접 행렬 bfs
//            bfsArr(1);
//            System.out.println(cnt);
//
//            clear();
//        }
    }


//    public static void dfsList(int start) {
//        if (list.get(start).isEmpty()) {
//            return;
//        }
//
//        for (int i = 0; i < list.get(start).size(); i++) {
//            int tmp = list.get(start).get(i);
//
//            if (isConnect[tmp]) continue;
//
//            isConnect[tmp] = true;
//            cnt++;
//            dfsList(tmp);
//        }
//    }

    public static void dfsArr(int start) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[start][i] == 1 && !isConnect[i]) {
                isConnect[i] = true;
                cnt++;
                dfsArr(i);
            }
        }
    }
//
//    public static void bfsList(int start) {
//        queue.add(start);
//
//        while(!queue.isEmpty()) {
//            int node = queue.poll();
//            for (int i = 0; i < list.get(node).size(); i++) {
//                int num = list.get(node).get(i);
//
//                if (!isConnect[num]) {
//                    isConnect[num] = true;
//                    cnt++;
//                    queue.add(num);
//                }
//            }
//        }
//    }
//
//    public static void bfsArr(int start) {
//        queue.add(start);
//
//        while(!queue.isEmpty()) {
//            int node = queue.poll();
//            for (int i = 1; i < arr[node].length; i++) {
//                int num = arr[node][i];
//
//                if (num == 1 && !isConnect[i]) {
//                    isConnect[i] = true;
//                    cnt++;
//                    queue.add(i);
//                }
//            }
//        }
//    }



}
