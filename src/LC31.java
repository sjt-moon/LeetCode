class LC31 {
    static void f(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        // find largest i s.t. nums[i] < max value after i
        int n = nums.length, runningMax = nums[n-1], i = n-2, j = n-1;
        while (i >= 0) {
            if (nums[i] < runningMax) {
                j = i + 1;
                break;
            }
            runningMax = nums[i--];
        }
        if (i < 0) {
            Utils.reverse(nums);
            return;
        }
        // rearrange nums[i:]
        while (j < n && nums[j] >= nums[i]) {
            j++;
        }
        j--;
        Utils.swap(nums, i, j);
        Utils.reverse(nums, i + 1, j);
    }
}
