class Solution {
    public int maxArea(int[] heights) {

        int l = 0;
        int r = heights.length -1;
        int max = 0;
        int val = 0;

        while(l < r){

            if(heights[l] > heights[r]){
                val = heights[r] *(r - l);
                r--;
            }
            else{
                val = heights[l] *(r-l);
                l++;
            }

                if(max < val){
                        max = val;
                }

                

        }
        return max;
    }
}
