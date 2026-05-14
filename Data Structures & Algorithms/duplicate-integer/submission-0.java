class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> result = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            result.add(nums[i]);
        }

        if(result.size() != nums.length){
            return true;
        }
        else{
            return false;
        }
        
    }
}