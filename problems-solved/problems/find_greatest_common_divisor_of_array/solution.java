class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int n = nums.length;
        int b = nums[n-1];
        int ans = 1;
        for (int i = a; i>0;i--) {
            if ((b%i==0)&&(a%i==0)) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}