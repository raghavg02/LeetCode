class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int finish[] = new int[friends.length];
        int n=0;
        for(int i=0; i<order.length; i++){
            for(int j=0; j<friends.length; j++){
                if(order[i]==friends[j]){
                    finish[n]=order[i];
                    n++;
                }
            }
        }
        return finish;
    }
}