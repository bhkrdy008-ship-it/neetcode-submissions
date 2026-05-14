class Solution {
    public int search(int[] nums, int target) {
        
        int l = 0;
        int r = nums.length -1;
        return binarySearch(nums, target, l, r);
        
         
    }

    public int binarySearch(int[] nums, int target, int l, int r) {
       

        if(l >r){
            return -1;
        }
        int m = l + (r - l) / 2;

        if(nums[m] == target){
            return m;
        }
        else if(nums[m] < target){
            return binarySearch(nums, target, m+1,r);
        }
        else if(nums[m] > target){
            return binarySearch(nums, target, l,m-1);
        }
        return -1;
    }
}
