package FindTheSmallestDivisorGivenAThreshold;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        BigInteger th = BigInteger.valueOf(threshold);
        int min = 1;
        int max = list.stream().max(Integer::compareTo).orElseThrow(() -> new RuntimeException("empty list"));
        int divisor = min;
        int minDivisor = 0;

        while (true) {
            if (getSum(list, divisor).compareTo(th) > 0) {
                int shift = (max - divisor) / 2;
                if (shift == 0) {
                    return minDivisor == 0 ? max : minDivisor;
                }

                divisor += shift;
            } else {
                if (minDivisor == 0 || divisor < minDivisor) {
                    minDivisor = divisor;
                }

                max = divisor;
                int shift = (max - min) / 2;
                if (shift == 0) {
                    return minDivisor == 0 ? max : minDivisor;
                }

                divisor = min + shift;
            }
        }
    }

    private BigInteger getSum(List<Integer> list, int divisor) {
        BigInteger sum = BigInteger.ZERO;
        for (int num : list) {
            int ceil = (int) Math.ceil(1D * num / divisor);
            sum = sum.add(BigInteger.valueOf(ceil));

        }
        return sum;
    }
}
