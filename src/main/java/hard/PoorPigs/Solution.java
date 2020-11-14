package hard.PoorPigs;

public class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int timesOfTry = (minutesToTest / minutesToDie) + 1;
        return findMinimumPigs(buckets, timesOfTry);
    }

    private int findMinimumPigs(int buckets, int t) {
        int power = 0;
        while (Math.pow(t, power) < buckets) {
            power++;
        }

        return power;
    }
}
