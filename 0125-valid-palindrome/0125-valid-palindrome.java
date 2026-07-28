class Solution {
    public boolean isPalindrome(String s) {
        String so = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for(int i=0; i<so.length()/2; i++){
            if(so.charAt(i) != so.charAt(so.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}