class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
                int count = 0;

        Arrays.sort(arr);
        int d = (arr[arr.length-1]-arr[0])/(arr.length-1);
        for (int i = 0; i <arr.length-1; i++) {
            if (arr[i+1]-arr[i] != d) {
                return false;
            }
        }
        return true;
    }
}