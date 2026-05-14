class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int max = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            long square = (long) m * m;
            if (square == x) {
                return m;
            } else if (square > x) {
                r = m - 1;
            } else if (square < x) {
                max = Math.max(max, m);
                l = m + 1;
            }
        }
        return max;
    }
}
