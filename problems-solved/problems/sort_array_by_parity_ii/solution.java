class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int count = 0;
        int o = 0;
        int e = 0;
        int temp = 0;
        int[] odd = new int[n/2];
        int[] even = new int[n/2];
        for (int  i = 0;i<n;i++) {
            if (nums[i]%2==0) {
                even[e]=nums[i];
                e++;
            }
            else {
                odd[o]=nums[i];
                o++;
            }
        }
        e=0;
        o=0;
        for (int i = 0;i<n; i++) {
            if (i%2==0){
                nums[i]=even[e];
                e++;
            }
            else {
                nums[i]=odd[o];
                o++;
            }
        }
        return nums;
    }
}