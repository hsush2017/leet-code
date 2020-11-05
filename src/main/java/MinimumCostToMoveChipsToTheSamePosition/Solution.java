package MinimumCostToMoveChipsToTheSamePosition;

public class Solution {
    public int minCostToMoveChips(int[] arr) {
        int oddCnt = 0;
        int evenCnt = 0;
        for (int v : arr) {
            if (v % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }

        return Math.min(oddCnt, evenCnt);
    }
}
