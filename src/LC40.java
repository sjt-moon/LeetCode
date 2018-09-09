import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class LC40 {
    static List<List<Integer>> f(int[] candidates, int target) {
        List<List<Integer>> answer = new LinkedList<>();
        Arrays.sort(candidates);
        backtracking(candidates, 0, 0, target, new LinkedList<>(), answer);
        return answer;
    }

    private static void backtracking(int[] arr, int start, int runningSum, int targetSum, List<Integer> list, List<List<Integer>> answer) {
        if (start >= arr.length || runningSum > targetSum) {
            return;
        }
        if (runningSum == targetSum) {
            List<Integer> ansList = new LinkedList<>(list);
            answer.add(ansList);
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (runningSum + arr[i] > targetSum) {
                return;
            }
            if (i > start && arr[i] == arr[i-1]) {
                continue;
            }
            list.add(arr[i]);
            backtracking(arr, i+1, runningSum + arr[i], targetSum, list, answer);
            // back track
            list.remove(list.size() - 1);
        }
    }
}
