class Solution {
    public int minimumDifference(int[] nums, int k) {
       Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-k+1; i++) {
            if ((nums[k+i-1] - nums[i]) < min) {
                min = nums[k+i-1] - nums[i];
            }
        }
        return min;
    }
}