public class Solution {
    public int[] countBits(int num) {
        if (num < 0) {
            return new int[0];
        }
        int[] result = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            if ((i & 1) == 0) {
                result[i] = result[i/2];
            } else {
                result[i] = result[i - 1] + 1;
            }
        }
        return result;
    }
}