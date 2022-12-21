class Solution {
    public int countEven(int num) {
        int n = num;
        int sum = 0;
        while (num!=0) {
            sum = sum +num%10;
            num=num/10;
        }
        if ((n%2)==0&&sum%2!=0) {
            return (n/2)-1;
        }
        return n/2;
    }
}