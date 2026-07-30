class Solution {
    public int numSplits(String s) {
        // --- Fast Java Template ---
        // Minimal variables, direct array usage
        
        int n = s.length();
        int[] leftDistinct = new int[n];
        int[] rightDistinct = new int[n];
        boolean[] seenLeft = new boolean[26], seenRight = new boolean[26];
        
        int dl = 0, dr = 0;
        
        // Left pass
        for (int i = 0; i < n; i++) {
            int idx = s.charAt(i) - 'a';
            if (!seenLeft[idx]) { seenLeft[idx] = true; dl++; }
            leftDistinct[i] = dl;
        }
        
        // Right pass
        for (int i = n - 1; i >= 0; i--) {
            int idx = s.charAt(i) - 'a';
            if (!seenRight[idx]) { seenRight[idx] = true; dr++; }
            rightDistinct[i] = dr;
        }
        
        // Count matches
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            if (leftDistinct[i] == rightDistinct[i + 1]) res++;
        }
        
        return res;
    }
}