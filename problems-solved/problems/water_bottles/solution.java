class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int f = numBottles;
        int e = numExchange;
        int sum = f;
        while (f>=e) {
            sum=sum+f/e;
            int r = f%e;
            f = (f/e)+r;
        }
        return sum;
    }
}