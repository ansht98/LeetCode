class Solution {
    public int sumOfUnique(int[] nums) {
       int n = nums.length;
       int sum = 0;
       int suml = 0;
       int sumr = 0;
       int count = 0;
       for (int i = 0; i < n; i++) {
           count = 0;
           for (int j = i-1; j >= 0;j--) {
               if (nums[i]==nums[j]){
                   count++;
               }
           }
           for (int k = i+1;k<n;k++) {
               if (nums[i]==nums[k]){
                   count++;
               }
           }
           if (count==0) {
               sum = sum+nums[i];
           }
       }
       return sum;
    }
}