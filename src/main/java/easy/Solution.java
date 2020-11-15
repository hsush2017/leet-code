package easy;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] A) {
        int[] arr = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            arr[i] = (int) Math.pow(A[i], 2);
        }

        return Arrays.stream(arr)
                .boxed()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
