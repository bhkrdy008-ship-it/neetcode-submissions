class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> value;

        for(int i = 0; i <nums.length -2;i++){
            int l = i+1;
            int r = nums.length - 1;

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

        while(l < r){
            if(nums[i] + nums[l] + nums[r] == 0){
                value = new ArrayList<>();
                value.add(nums[i]);
                value.add(nums[l]);
                value.add(nums[r]);
                result.add(value);
                l++;
                r--;

                while(l<r && nums[l] == nums[l-1]){
                    l++;
                }
                while(l<r && nums[r] == nums[r+1]){
                    r--;
                }
            }
            else if(nums[i] + nums[l] + nums[r] < 0){
                l++;
            }
            else{
                r--;
            }
        } 
        }

        return result;       
    }
}
