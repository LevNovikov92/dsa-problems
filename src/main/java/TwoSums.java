class TwoSums {

    int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            final int rest = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (j == i) continue;
                if (rest == nums[j]) return new int[] {i, j};
            }
        }
        return new int[0];
    }
}
