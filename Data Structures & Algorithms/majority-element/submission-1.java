class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.putIfAbsent(num, 0);
            map.put(num, (map.get(num) + 1));
        }

        
        int maxCount = Integer.MIN_VALUE;
        int result = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(maxCount < entry.getValue()){
                maxCount = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}