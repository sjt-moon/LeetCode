
class LC45 {
    static int f(int[] nums) {
        if (nums.length <= 0) {
            return -1;
        }
        int n = nums.length, currentFarthest = nums[0], nextFarthest = 0, level = 0, i = 0;
        // queue: [i:currentFarthest]
        while (currentFarthest >= i) {
            level++;
            if (currentFarthest >= n-1) {
                return level;
            }
            for (; i <= currentFarthest; i++) {
                nextFarthest = Math.max(nextFarthest, i + nums[i]);
            }
            currentFarthest = nextFarthest;
        }
        return level;
    }
}
