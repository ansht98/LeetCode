class Solution {
    public int sumOfDigits(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int sum = 0;
        int digit = 0;
        while (a>0) {
            sum = sum+a%10;
            a = a/10;
        }
        if (sum%2==0) {
            return 1;
        }
        return 0;
    }
}