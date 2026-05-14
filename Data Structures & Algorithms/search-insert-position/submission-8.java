class Solution {

    public int searchInsert(int[] nums, int target) {
        return insertSearch(nums, target, 0, nums.length - 1);
    }

    public int insertSearch(int[] nums, int target, int l, int r) {

        if (l > r) {
            return l;
        }

        int m = l + (r - l) / 2;

        if (nums[m] == target) {
            return m;
        }

        else if (nums[m] < target) {
            return insertSearch(nums, target, m + 1, r);
        }

        else {
            return insertSearch(nums, target, l, m - 1);
        }
    }
}