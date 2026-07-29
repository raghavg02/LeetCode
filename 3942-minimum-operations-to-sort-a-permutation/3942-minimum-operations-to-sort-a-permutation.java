class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int sRot = -1;
        boolean sRev = false;
        
        o:
        for (int r = 0; r < n; r++) {
            for (int j = 0; j < n; j++)
                if (nums[j] != (j + r) % n) continue o;
            sRot = r; break;
        }
        
        if (sRot == -1) {
            o2:
            for (int r = 0; r < n; r++) {
                for (int j = 0; j < n; j++)
                    if (nums[j] != (n - 1 - (j + r) % n)) continue o2;
                sRot = r; sRev = true; break;
            }
        }
        if (sRot == -1) return -1;
        int[][] Distance = new int[2][n];
        for (int[] d : Distance) Arrays.fill(d, -1);
        Queue<int[]> q = new LinkedList<>();
        int sR = sRev ? 1 : 0;
        Distance[sR][sRot] = 0;
        q.offer(new int[]{sR, sRot});
        
        while (!q.isEmpty()) {
            int[] Current = q.poll();
            int Rev = Current[0];
            int Rot = Current[1];
            int d = Distance[Rev][Rot];
            
            if (Rev == 0 && Rot == 0) return d;
            int R1 = (Rot + 1) % n;
            if (Distance[Rev][R1] == -1) {
                Distance[Rev][R1] = d + 1;
                q.offer(new int[]{Rev, R1});
            }
            int newRev = 1 - Rev;
            int R2 = (n - Rot) % n;
            if (Distance[newRev][R2] == -1) {
                Distance[newRev][R2] = d + 1;
                q.offer(new int[]{newRev, R2});
            }
        }
        return -1;
    }
}