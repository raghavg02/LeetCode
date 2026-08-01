class Solution {
    public int mostWordsFound(String[] sentences) {
        int counter = 1;
        int maxCounter = 0;
        for(int i=0; i<sentences.length; i++){
            for(int j=0; j<sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    counter++;
                }
            }
            if(counter>maxCounter){
                maxCounter = counter;
            }
            counter = 1;
        }
        return maxCounter;
    }
}