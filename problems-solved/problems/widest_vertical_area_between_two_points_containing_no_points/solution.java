class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] a = new int[points.length];
       for (int i = 0; i < points.length; i ++) {
           a[i] = points[i][0];
       }
        int max = 0;
        Arrays.sort(a);
        for (int j = 0; j < a.length-1; j++) {
            if (a[j+1]-a[j] > max) {
                max = a[j+1]-a[j];
            }
        }
        return max;
    }
}