class Solution {
    public int findMin(int[] nums) {
        int l =0;
        int r = nums.length -1;

        while(l <= r){
            if(r == l){
                return nums[r];
            }
           else if(nums[r] < nums[l]){
                l++;
            }
            else if(nums[r]> nums[l]){
                r--;
            }
            
        }

        return -1;

    }
}
