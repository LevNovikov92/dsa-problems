public class RotateArray {

    public void rotate(final int[] nums, int k) {
        if (nums.length == 0 || nums.length == 1) return;
        final int[] clone = nums.clone();
        for (int i = 0; i < clone.length; i++) {
            nums[getShiftedIndex(i, k, nums.length)] = clone[i];
        }
    }

    int getShiftedIndex(int i, int k, int length) {
        int index = i + k;
        while (index >= length) {
            index = index - length;
        }
        return index;
    }
}
