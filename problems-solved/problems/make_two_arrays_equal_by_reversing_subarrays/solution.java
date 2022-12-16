class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);
        int n = arr.length;
        int count = 0;
        for (int i = 0;i<n;i++) {
            if (target[i]==arr[i]) {
                count++;
            }
        }
        if (count==n) {
            return true;
        }
        return false;
    }
}