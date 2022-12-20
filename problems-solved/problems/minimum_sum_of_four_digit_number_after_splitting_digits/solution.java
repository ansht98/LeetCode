class Solution {
    public int minimumSum(int num) {
        int[] nums1 = new int[2];
        int[] nums2 = new int[2];
        int[] nums = new int[4];
        for (int i = 0;i<4;i++) {
            nums[i] = num%10;
            num=num/10;
        }
        Arrays.sort(nums);
        int ans = (10*nums[0])+(10*nums[1])+(nums[2])+(nums[3]);
        return ans;
    }
}