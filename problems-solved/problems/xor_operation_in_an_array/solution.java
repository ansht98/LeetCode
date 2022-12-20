class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int answer = 0;
        for (int i = 0;i<n;i++) {
            nums[i]=start+(2*i);
        }
        if (n>1) {
        int ans = nums[0]^nums[1];
        if(n>2){
        for (int i =2;i<n;i++) {
            ans = ans^nums[i];
        }
        answer = ans;
        }}
        if (n==1){
            return nums[0];
        }
        return answer;
    }
}