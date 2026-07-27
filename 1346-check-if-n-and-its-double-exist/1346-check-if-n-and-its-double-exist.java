class Solution {
    public boolean checkIfExist(int[] arr) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (i != j && arr[i] == 2 * arr[j]) {
                return true;
            }
            j++;
            if (j == arr.length) {
                i++;
                j = 0;
            }
        }
        return false;
    }
}