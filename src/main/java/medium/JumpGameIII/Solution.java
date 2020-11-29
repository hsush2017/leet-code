package medium.JumpGameIII;

public class Solution {
    public boolean canReach(int[] arr, int start) {
        if (start < 0 || start >= arr.length || arr[start] == -1) {
            return false;
        }

        if (arr[start] == 0) {
            return true;
        }

        int forwardPosition = start + arr[start];
        int backwardPosition = start - arr[start];
        arr[start] = -1;

        return canReach(arr, forwardPosition) || canReach(arr, backwardPosition);
    }
}
