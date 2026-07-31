class Solution {
    public int singleNumber(int[] nums) {
        int counter = 0;
        int single = 0;
        for(int i=0; i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    counter++;
                }
            }
            if(counter==0){
                single = nums[i];
            }
            counter=0;
        }
        return single;
    }
}