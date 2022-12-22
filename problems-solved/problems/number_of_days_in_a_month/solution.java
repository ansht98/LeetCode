class Solution {
    public int numberOfDays(int year, int month) {
        if (year%400==0&&month==2) {
            return 29;
        }
        if (year%4==0&&month==2&&year%100!=0) {
            return 29;
        }
        else if (month<8)
        {
        if (month%2==0) {
        if (month==2) {
            return 28;
        }
        else {
            return 30;
        }
        }
        else {
        return 31;
        }
        }
else {
    if (month%2==0) {
        return 31;
    }
}
return 30;
    }
}