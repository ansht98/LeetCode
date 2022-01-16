class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        int previous = nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ( previous != nums[i] ) {
                count = count + nums.length-i;
                previous = nums[i];
            }
            
        }
        return count;
    }
}