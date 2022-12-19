class Solution {
    public int pivotInteger(int n) {
        if (n>2) {
        int[] ans = new int [n];
        for (int i = 0;i<n;i++) {
            ans[i] = i+1;
        }
        int[] sum = new int[n];
        sum[0]=ans[0];
        for (int i = 1;i<n;i++) {
            sum[i]=sum[i-1]+ans[i];
        }
        for (int i = 1;i<n-1;i++) {
            int suml = sum[i];
            int sumr = sum[n-1]-sum[i-1];
            if (suml==sumr) {
                return i+1;
            }
        }
        }
        if (n==1) {
            return n;
        }
        if (n==2) {
            return -1;
        }
        return -1;
    }
}