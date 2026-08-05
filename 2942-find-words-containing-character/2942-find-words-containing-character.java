class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                if(words[i].charAt(j) == x){
                    indices.add(i);
                    break;
                }
            }
        }
        return indices;
    }
}