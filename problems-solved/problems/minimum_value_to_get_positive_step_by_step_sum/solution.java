class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int a = 0;
        for (int i = 0;i<n;i++) {
            a=a+nums[i];
            if (a<min) {
                min = a;
            }
        }
        if (min < 0) {
            return (min*-1)+1;
        }
        return 1;
    }
}