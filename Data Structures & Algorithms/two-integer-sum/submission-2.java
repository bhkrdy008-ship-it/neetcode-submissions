class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums.length == 0){
            return null;
        }

        for(int i =0; i< nums.length ; i++){
            for(int j =0; j< nums.length; j++){
               if( nums[i] + nums[j] == target && i!=j){
                    result[0] = j;
                    result[1] = i;
               }
            }
        }
        return result;
    }
}
