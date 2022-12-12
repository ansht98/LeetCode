class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int count = 0;
       for (int i = 1; i < n-1; i++){
           int j = 0;
           int k = n-1;
           int leftdiff = 0;
           int rightdiff = 0;
           while(j<i) {
               if (nums[i]-nums[j]==diff) {
                   leftdiff++;
                   break;
               }
               j++;
           }
           while(i<k){
               if (nums[k]-nums[i]==diff) {
                   rightdiff++;
                   break;
               
           }
           k--;
       }
       if (leftdiff==1&&rightdiff==1){
           count++;
       }
    }
    return count;
}

}