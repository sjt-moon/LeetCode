class LC41 {
    static int f(int[] nums) {
        if (nums.length <= 0) {
            return 1;
        }

        boolean isNFound = false;

        // first use 0 to replace all invalid items
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == n) {
                isNFound = true;
            }
            if (nums[i] <= 0 || nums[i] >= n) {
                nums[i] = 0;
            }
        }

        // then use negativity-trick to mark all valid items after being visited
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                continue;
            }
            int x = Math.abs(nums[i]);
            if (nums[x] == 0) {
                nums[x] = -x;
            }
            else {
                nums[x] = - Math.abs(nums[x]);
            }
        }

        Utils.print(nums);

        for (int i = 1; i < n; i++) {
            if (nums[i] >= 0) {
                return i;
            }
        }
        return isNFound ? n + 1 : n;
    }
}
