class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] a = heights.clone();
        Arrays.sort(a);
        for (int j = 0; j < heights.length; j++) {
            if (a[j] != heights[j]) {
                count++;
            }
        }
        return count;
    }
}