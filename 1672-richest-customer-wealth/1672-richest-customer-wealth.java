class Solution {
    public int maximumWealth(int[][] accounts) {
        int ambani = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[0].length; j++){
                sum += accounts[i][j];
            }
            if(sum > ambani){
                ambani = sum;
            }
            sum = 0;
        }
        return ambani;
    }
}