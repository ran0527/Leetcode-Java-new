public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] res = new int[findNums.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], -1);
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    map.put(nums[i], nums[j]);
                    break;
                } 
            }
        }
        for (int i = 0; i < findNums.length; i++) {
            res[i] = map.get(findNums[i]);
        }
        return res;
    }
}