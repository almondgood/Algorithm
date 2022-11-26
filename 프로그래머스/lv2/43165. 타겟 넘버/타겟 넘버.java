class Solution {
    static int answer = 0;

    public int solution(int[] numbers, int target) {

        dfs(numbers, 0, target, 0);

        return answer;
    }

    public void dfs(int[] numbers, int depth, int target, int now) {
        if (depth == numbers.length) {
            if (now == target) {
                answer++;
            }
            return;
        }

        dfs(numbers, depth + 1, target, now - numbers[depth]);


        dfs(numbers, depth + 1, target, now + numbers[depth]);


    }
}