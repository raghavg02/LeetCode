class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> r = new ArrayList<>();
        int c = 1;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(i==0){
                r.add(nums[i]);
            } else if(nums[i]==nums[i-1]){
                if(c<k){
                    r.add(nums[i]);
                    c++;
                }
            } else {
                r.add(nums[i]);
                c=1;
            }
        }
        return r.stream().mapToInt(Integer::intValue).toArray();
    }
}