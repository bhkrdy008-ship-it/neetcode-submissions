class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        int length = nums.length/3;
        Set<Integer> res = new HashSet<>();

        for(int i =0; i<nums.length; i++){
            hash.put(nums[i], hash.getOrDefault(nums[i],0)+1);
        }

         for(int i =0; i<nums.length; i++){
            if(hash.get(nums[i]) > length){
                res.add(nums[i]);
            }
        }

        List<Integer> result = new ArrayList<>(res);
        
        return result;
        
    }
}