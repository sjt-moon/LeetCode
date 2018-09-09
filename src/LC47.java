import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class LC47 {
    static List<List<Integer>> f(int[] nums) {
        List<List<Integer>> answer = new LinkedList<>();
        Arrays.sort(nums);
        backtracking(nums, new boolean[nums.length], new LinkedList<>(), answer);
        return answer;
    }

    /**
     * put arr[start] into list
      */
    private static void backtracking(int[] arr, boolean[] vis, List<Integer> list, List<List<Integer>> answer) {
        if (list.size() == arr.length) {
            List<Integer> ansList = new LinkedList<>(list);
            answer.add(ansList);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (vis[i]) {
                continue;
            }
            if (i+1 < arr.length && arr[i] == arr[i+1] && vis[i+1]) {
                return;
            }
            list.add(arr[i]);
            vis[i] = true;
            backtracking(arr, vis, list, answer);
            list.remove(list.size() - 1);
            vis[i] = false;
        }
    }
}
