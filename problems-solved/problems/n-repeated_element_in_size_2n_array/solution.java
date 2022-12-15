class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (nums[n/2]==nums[(n/2)+1]){
            return nums[n/2];
        }
        return nums[(n/2)-1];
    }
}