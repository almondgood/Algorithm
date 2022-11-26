import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : completion) {
            if (map.containsKey(s)) {
                Integer num = map.get(s);
                map.replace(s, num, num + 1);
            } else {
                 map.put(s, 1);
            }
        }

        for (String s : participant) {
            if (!map.containsKey(s)) {
                return s;
            }

            Integer num = map.get(s);
            map.replace(s, num, num - 1);

            if (num == 0) {
                return s;
            }
        }

        return answer;
    }
}