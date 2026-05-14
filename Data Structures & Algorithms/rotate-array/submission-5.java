class Solution {
    public void rotate(int[] nums, int k) {
        int[] x = new int[nums.length];

        for(int i =0; i<nums.length; i++){
                x[(i+k)% nums.length] = nums[i];
        }

        for(int i =0; i<nums.length; i++){
                nums[i] = x[i];
        }
    }
}