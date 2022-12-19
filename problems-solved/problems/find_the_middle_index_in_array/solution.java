class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0]=nums[0];
        for (int i = 1; i < n;i++) {
            ans[i]=ans[i-1]+nums[i];
        }
        for (int i = 0;i<n;i++)  {
            if (i==0) {
                int suml = 0;
                int sumr = ans[n-1]-ans[0];
                if (suml == sumr) {
                    return i;
                }
            }
            else if (i==n-1) {
                int sumr = 0;
                int suml = ans[i]-nums[i];
                if (suml == sumr) {
                    return i;
                }
            }
            else {
                int suml = ans[i-1];
                int sumr = ans[n-1]-ans[i];
                 if (suml == sumr) {
                    return i;
                }
            }
        }
        return -1;
    }
}