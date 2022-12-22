class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int num = n+1;
        for (int i = 0;i<num;i++) {
            sum=sum+i;
        }
        for (int i = 0;i<n;i++) {
            sum=sum-nums[i];
        }
        return sum;
    }
}