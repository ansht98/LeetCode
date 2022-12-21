class Solution {
    public int totalMoney(int n) {
        float r = n%7;
        float d=n/7;
        float sum = 0;
        if (n>7) {
            sum = (d/2)*(56+((d-1)*7));
        }
        sum = sum + (r/2)*(2*(d+1)+(r-1));
        int a = (int)sum;
        return a;
            }
}