class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = 0;
        int sum = 0;
        for (int i = n-1;i>1;i--) {
            for (int j = i-1;j>0;j--) {
                if ((nums[j]+nums[j-1])>nums[i]) {
                    sum = nums[i]+nums[j]+nums[j-1];
                    if (sum>max) {
                        max=sum;
                    }
                }
                sum = 0;
            }
        }
        return max;
    }
}