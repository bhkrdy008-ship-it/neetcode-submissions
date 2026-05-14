class Solution {
    public int maxProfit(int[] prices) {
        int[] diff = new int[prices.length];
        int profit = 0;
        for(int i =0; i< prices.length-1; i++){
                diff[i] = prices[i+1] - prices[i];
        }

        for(int i =0; i< diff.length; i++){
            if(diff[i]>0){
                profit+=diff[i];
            }
        }

        return profit;
    }
}