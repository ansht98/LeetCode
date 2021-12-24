class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < (nums.length - 1); i++) {
            if (nums[i] < nums[i+1]) {
                count++;
            }
            else {
                count = 0;
            }
            if (max < count) {
                max = count;
            }
            
        }
        return max+1;
    }
}