
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

 class Solution {
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        bfs(maps);

        answer = maps[maps.length - 1][maps[0].length - 1];
        
        return answer > 1 ? answer : -1;
    }
    
    public void bfs(int[][] maps) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0));
        
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int x = node.x;
            int y = node.y;
            
            if (x < maps[0].length - 1 && maps[y][x + 1] == 1) {
                // 오른쪽
                maps[y][x + 1] = maps[y][x] + 1;
                queue.add(new Node(x + 1, y));
            }
            if (y < maps.length - 1 && maps[y + 1][x] == 1) {
                // 아래쪽
                maps[y + 1][x] = maps[y][x] + 1;
                queue.add(new Node(x, y + 1));

            } 
            if (y > 0 && maps[y - 1][x] == 1) {
                // 위쪽
                maps[y - 1][x] = maps[y][x] + 1;
                queue.add(new Node(x, y - 1));

            }
            if (x > 0 && maps[y][x - 1] == 1) {
                // 왼쪽
                maps[y][x - 1] = maps[y][x] + 1;
                queue.add(new Node(x - 1, y));

            }


        }
        
    }
    
}