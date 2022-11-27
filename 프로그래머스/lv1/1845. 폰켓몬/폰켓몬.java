import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int cnt = nums.length / 2;
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        return Math.min(cnt, set.size());
    }
}