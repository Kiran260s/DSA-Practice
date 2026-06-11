class Solution {
    public int singleNumber(int[] nums) {
       int index = 0;
       for(int i=0; i<nums.length; i++){
        index = index ^ nums[i];
       }
       return index;
    }
}
//https://leetcode.com/problems/single-number/solutions/6828548/beginner-freindlyjavacpythonjs-by-ashokv-zntj