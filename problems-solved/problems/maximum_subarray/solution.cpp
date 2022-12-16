class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxi = INT_MIN;
        int sum = 0;

        for (int i=0; i<nums.size(); i++){
            sum += nums[i];
            if (sum < nums[i]){
                sum = nums[i];
                maxi = max(nums[i], maxi);
            }
            else{
                maxi = max(sum, maxi);
            }
        }

        return maxi;
    }
};