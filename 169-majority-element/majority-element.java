class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int majority = 0;
        for(int i = 0; i<nums.length; i++){
            if(count == 0){ //We intialize majority as nums[i] before it becomes -1
                majority = nums[i];
            }
            if(majority == nums[i]){
                count++;
            }
            else{
                count--;
            }
    }
    return majority;
}}