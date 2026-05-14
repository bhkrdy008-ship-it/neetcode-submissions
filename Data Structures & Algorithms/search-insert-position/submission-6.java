class Solution {
    public int searchInsert(int[] nums, int target) {
        int l =0;
        int r = 1;
     if(target <= nums[0]){
                return 0;
            }
    if(target == nums[nums.length -1]){
        return nums.length-1;
    }
        for(int i = 0; i<nums.length-1; i++){
           
            if(nums[l] == target){
                return l;
            }
            if(nums[r]== target){
                return r;
            }
            else if(nums[l]<target && nums[r] > target){
                return r;
            }
            else{
                l++;
                r++;
            }
        }
        return nums.length;
    }
}