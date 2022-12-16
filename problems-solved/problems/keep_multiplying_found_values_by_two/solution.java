class Solution {
    public int findFinalValue(int[] nums, int original) {
       int n = nums.length;
        
        int ans = original;
        int count = 0;
        for (int m = 0;m<n;m++) {
          for (int i = 0;i<n;i++ ) {
              if (nums[i]==ans){
                  ans = ans*2;
                  i = n;
              }
          }
        }
        return ans;
    }
}