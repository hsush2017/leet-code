package medium.LongestMountainInArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int longestMountain(int[] A) {
        int start = -1;
        int max = 0;
        List<Integer> highLow = getHighLow(A);

        for (int i = 0; i < highLow.size() - 1; i++) {
            if (highLow.get(i) == 0) {
                start = -1;
            }

            if (isChangePoint(highLow.get(i), highLow.get(i + 1))) {
                if (start >= 0) {
                    int len = i - start + 1;
                    if (len > max) {
                        max = len;
                    }
                }

                start = i;
            }
        }

        return max;
    }

    private List<Integer> getHighLow(int[] a) {
        List<Integer> highLow = new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] == a[i]) {
                highLow.add(0);
            } else {
                highLow.add(a[i + 1] > a[i] ? 1 : -1);
            }

            if (i == 0) {
                if (a[i + 1] == a[i]) {
                    highLow.add(0, 0);
                } else {
                    highLow.add(0, a[i + 1] > a[i] ? -1 : 1);
                }
            }

            if (i == a.length - 2) {
                if (a[i + 1] == a[i]) {
                    highLow.add(0, 0);
                } else {
                    highLow.add(a[i + 1] > a[i] ? -1 : 1);
                }
            }
        }
        return highLow;
    }

    private boolean isChangePoint(int current, int next) {
        return current == -1 && next == 1 || current == 0 && next == 1 || current == -1 && next == 0;
    }
}
