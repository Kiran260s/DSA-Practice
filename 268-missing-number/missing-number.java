class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length; //If all numbers are present then n is missing 
    }
}