class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        //Compute the sum of first k elements
        int sum = 0;
        for(int i=0; i<k; i++)
        {
            sum += nums[i];
        }
        //Initialize the max_sum and keep update the max_sum along the sliding window
        int max_sum = sum;
        
        //Sliding window
        //int i = k because we have to start adding element from k index and removing the first index of the window.
        for(int i = k; i< n; i++){ 
            sum -= nums[i-k]; //Remove the first element i.e. 0
            sum += nums[i]; //Add the element after the window i.e. k
            max_sum = Math.max(max_sum,sum);
        }
        return (double) max_sum / k;
        }
    }