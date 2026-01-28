class NumArray {
    int[] prefix;
    public NumArray(int[] nums) {
        prefix = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            prefix[i+1] = prefix[i] + nums[i]; //obj[0] = 0 because when we initialize an array all the elements are set to 0.
        }
    }
    
    public int sumRange(int left, int right) {
        return prefix[right+1] - prefix[left];
    }
}//We can also use left-1 as formula but it will be slightly different.

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */