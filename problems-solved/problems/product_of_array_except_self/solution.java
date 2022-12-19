class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if (n>2) {
        int[] sum1 = new int[n];
        int[] sum2 = new int[n];
        sum1[0]=1;
        sum1[1]=nums[0];
        for (int i = 2;i<n;i++) {
            sum1[i]=sum1[i-1]*nums[i-1];
        }
        sum2[n-1]=1;
        sum2[n-2]=nums[n-1];
        for (int i=n-3;i>=0;i--)  {
            sum2[i]=sum2[i+1]*nums[i+1];
        }
        for (int i = 0;i<n;i++) {
            nums[i]=sum1[i]*sum2[i];
        }
        return nums;
        }
        if (n==2) {
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1]=temp;
            return nums;
        }
        return nums;
    }
}