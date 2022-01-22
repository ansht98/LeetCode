class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int index = nums.length-1;
        for (int i = nums.length-1; i >=1; i--) {
            if (nums[i]>nums[i-1]) {
                count++;
                index = i;
            }
            if (count == 2) {
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}