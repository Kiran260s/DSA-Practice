// The size of the window k = 2.
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0, high = 0, minLenWindow = Integer.MAX_VALUE;
        int curr_sum = 0;
        for(high = 0; high < nums.length; high++){
            curr_sum += nums[high];
            while(curr_sum >= target){
                int currWindowLen = high-low+1; 
                minLenWindow = Math.min(minLenWindow,currWindowLen);
                curr_sum = curr_sum - nums[low]; //Slide the window to look for smaller window length.
                low++;
            }
        }
        if(minLenWindow == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return minLenWindow;
        }
    }
}