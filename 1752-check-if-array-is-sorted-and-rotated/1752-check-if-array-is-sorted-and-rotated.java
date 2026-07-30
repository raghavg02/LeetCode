class Solution {
    public boolean check(int[] nums) {
        int drop = 0;
        for(int i=0 ; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                drop++;
            }
        }
        if(nums[nums.length-1]>nums[0]){
                drop++;
            }
        if(drop>1){
            return false;
        }
        return true;
    }
}
