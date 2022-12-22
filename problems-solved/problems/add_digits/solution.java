class Solution {
    public int addDigits(int num) {
        int r = 0;
       if (num==0) {
           return 0;
       }
        else {
            r = num%9;
        }
        if (r==0) {
            return 9;
        }
        return r;
    }
}