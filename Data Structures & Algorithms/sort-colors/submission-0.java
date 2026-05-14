class Solution {
    public void sortColors(int[] nums) {
        nums = sortArray(nums);
    }

    public int[] sortArray(int[] nums){
             int arrLength = nums.length;
        int mid = nums.length / 2;
        int[] arrLeft = new int[mid];
        int[] arrRight = new int[nums.length - mid];

        if(nums.length == 1){
            return nums;
        }

        for (int i = 0; i < mid; i++) {
             arrLeft[i] = nums[i];
        }

        for (int i = 0; i < arrRight.length; i++) {
            arrRight[i] = nums[i+mid];
        }
        sortArray(arrLeft);
        sortArray(arrRight);

        int i =0; int j =0; int k =0;

       while(i < arrLeft.length && j < arrRight.length){
        if(arrLeft[i] <= arrRight[j]){
            nums[k++] = arrLeft[i++];
        }
        else{
            nums[k++] = arrRight[j++];
        }
       }

       while(i < arrLeft.length){
        nums[k++] = arrLeft[i++];
       }

        while(j < arrRight.length){
            nums[k++] = arrRight[j++];
        }

        return nums;
    }
}