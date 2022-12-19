class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int sum = 0;
        ans[0] = arr[0];
        for (int i = 1;i<n;i++) {
            ans[i]=ans[i-1]+arr[i];
        }
        for (int i=0;i<n;i++) {
            for (int j = i;j<n;j=j+2) {
                if (i==0) {
                    sum=sum+ans[j];
                }
                else {
                    sum=sum+ans[j]-ans[i-1];
                }
            }
            
        }
        return sum;
        
    }
}