class Solution {
    public void rotate(int[] nums, int k) {
        int i = 0;
        

        if(k > nums.length){
                k = k % nums.length;
        }
        int j = nums.length - k;
        int[] ne = new int[k];

        for (int l = 0; l < k; l++) {
                ne[l] = nums[j];
                j++;
                
        }

        int h = 0;
        while(h < k){
         for(int r = nums.length -1; r>0; r--){
                nums[r] = nums[r-1]; 
        
        }
        h++;
        }

        for(int u =0; u<ne.length; u++){
                nums[u] = ne[u];
        }
    }
}
