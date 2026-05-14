class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.putIfAbsent(num, 0);
            map.put(num, (map.get(num) + 1));
        }

        int majority = -1;
        int maxCount = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                majority = entry.getKey(); // ✅ capture the key
            }
        }

        return majority;
    }
}