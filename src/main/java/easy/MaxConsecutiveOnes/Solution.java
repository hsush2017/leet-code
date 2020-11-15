package easy.MaxConsecutiveOnes;

public class Solution {
    private int max = 0;

    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                int j = i;
                int cnt = 0;
                while (j < nums.length && nums[j] == 1) {
                    cnt++;
                    j++;
                }

                if (cnt > max) {
                    max = cnt;
                }

                i = j + 1;
            } else {
                i++;
            }
        }

        return max;
    }
}
