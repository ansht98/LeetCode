class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums.length/2;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count  = count + Math.abs(nums[mid]-nums[i]);
        }
        return count;
    }
}