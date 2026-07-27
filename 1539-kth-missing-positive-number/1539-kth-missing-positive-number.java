class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missingCount = 0;
        int i=0;
        int count=1;
        while(missingCount<k){
            if(i<arr.length && arr[i]==count){
                i++;
            }else{
                missingCount++;
            }
            count++;
        }
        return count-1;
    }
}