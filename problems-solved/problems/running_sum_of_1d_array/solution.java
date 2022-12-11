class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++)
        {
            int sum = 0;
            for (int j = 0;j<i+1;j++) {
                sum = sum + nums[j];
            }
            ans[i]=sum;
        }
        return ans;
    }
}