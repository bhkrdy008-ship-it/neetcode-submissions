class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int colSize = matrix[0].length - 1;
        int rowSize = matrix.length - 1;
        int r1 = 0;
        int l1 = 0;
        while (l1 < rowSize && target > matrix[l1][colSize]) {
            r1++;
            l1++;
        }
        int l = 0;
        int r = colSize;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (matrix[r1][m] == target) {
                return true;
            }
            else if (matrix[r1][m] < target) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return false;
    }
}