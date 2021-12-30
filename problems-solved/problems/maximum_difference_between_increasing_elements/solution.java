class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]-nums[i] > max) {
                    max = nums[j]-nums[i];
                }
            }
        }
        if (max == 0) {
            max = -1;
        }
        return max;
    }
}