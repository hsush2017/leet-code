package easy.TwoSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> visited = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (hasVisited(nums[i], visited)) {
                continue;
            } else {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }

            visited.add(nums[i]);
        }

        return new int[]{};
    }

    private boolean hasVisited(int num, List<Integer> visited) {
        for (int visitedVal : visited) {
            if (num == visitedVal) {
                return true;
            }
        }

        return false;
    }
}
