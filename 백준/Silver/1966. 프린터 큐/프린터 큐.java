import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int t = Integer.parseInt(st.nextToken());

        while (t-- > 0) {
            Queue<Integer> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            int cnt = 1;


            int n = Integer.parseInt(st.nextToken());
            int cur = Integer.parseInt(st.nextToken());
            int curImportant = -1;
            int[] important = new int[10];


            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(st.nextToken());
                important[num]++;
                queue.add(num);


                if (i == cur) {
                    curImportant = num;
                }
            }


            int order = 9;
            while (order > curImportant) {
                if (important[order] > 0) {

                    if (queue.peek() == order) {
                        queue.poll();
                        cnt++;
                        cur--;
                        important[order]--;
                    } else {
                        queue.add(queue.poll());
                        cur = (cur - 1 + queue.size()) % queue.size();
                    }

                } else {
                    order--;
                }
            }

            while (cur != 0) {
              if (queue.peek() < curImportant) {
                  queue.add(queue.poll());
                  cur--;
              }
              else {
                  queue.poll();
                  cur--;
                  cnt++;
              }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);

    }
}