class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<Integer> value;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0; i<nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
        for(int j = nums.length -1; j > i; j--){
            if(j<nums.length - 1 && nums[j] == nums[j+1]){
                continue;
            }
            int l = i +1;
            int r = j -1;

            while(l < r){
                long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                if(sum == target){
                    value = new ArrayList<Integer>();
                    value.add(nums[i]);
                    value.add(nums[l]);
                    value.add(nums[r]);
                    value.add(nums[j]);
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
                else if(sum > target){
                    r--;
                }
                else if(sum < target){
                    l++;
                }
            }
        }
        }

        return result;
    }
}