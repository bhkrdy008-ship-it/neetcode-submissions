class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i =0;
        int j =0;

        for(int l = nums1.length - 1; l> nums1.length - 1 - n ; l--){
            nums1[l] = nums2[j];
            j++;
        }

        Arrays.sort(nums1);

        
    }
}