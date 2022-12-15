class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int check = 0;
        for (int i = 0; i <n;i=i+2) {
            if (nums[i]!=nums[i+1]) {
                check=1;
            }
        }
        if (check==1){
            return false;
        }
        return true;
    }
}