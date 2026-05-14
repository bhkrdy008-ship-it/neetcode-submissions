class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int[] result = new int[k];
        for(int val : nums){
            frequency.put(val, frequency.getOrDefault(val,0)+1);
        }

        
        Integer[] arr = new Integer[frequency.size()];
        int i =0;
        while(i<k){
            int min = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> value : frequency.entrySet()){
            if(value.getValue() > min){
                arr[0] = value.getKey();
                min = value.getValue();
            }
        }

        result[i++] = arr[0];
        frequency.remove(arr[0]);
        
        }

        return result;
    }
}
