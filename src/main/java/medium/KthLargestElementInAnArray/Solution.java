package medium.KthLargestElementInAnArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }

        list.sort(Collections.reverseOrder());

        return list.get(k - 1);
    }
}
