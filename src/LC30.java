import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LC30 {
    public static List<Integer> f(String s, String[] words) {
        List<Integer> answer = new LinkedList<>();
        if (words == null || words.length <= 0 || s.length() < words[0].length()) {
            return answer;
        }
        int k = words[0].length(), total = words.length;

        // init
        Map<String, Integer> map = new HashMap<>();
        for (String w: words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        // k rounds
        for (int start = 0; start < k; start++) {
            int i = 0, j = 0;
            while (j + k < s.length()) {
                String w1 = s.substring(j, j + k);
                if (map.containsKey(w1)) {
                    if (map.get(w1) > 0) {
                        map.put(w1, map.get(w1) - 1);
                        total--;
                        j += k;
                        if (total <= 0) {
                            answer.add(i);
                        }
                    }
                    else {
                        String w2 = s.substring(i, i + k);
                        while (i < j && !w2.equals(w1)) {
                            map.put(w2, map.get(w2) + 1);
                            total++;
                            i += k;
                            w2 = s.substring(i, i + k);
                        }
                        i += k;
                        j += k;
                    }
                }
                else {
                    String w2 = s.substring(i, i + k);
                    while (i < j) {
                        map.put(w2, map.get(w2) + 1);
                        total++;
                        i += k;
                        w2 = s.substring(i, i + k);
                    }
                    j += k;
                    i = j;
                }
            }
        }
        return answer;
    }
}
