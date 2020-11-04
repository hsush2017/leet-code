package ConsecutiveCharacters;

public class Solution {
    public int maxPower(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int max = 0;
        int cnt = 1;
        char previous = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == previous) {
                cnt++;
            } else {
                if (cnt > max) {
                    max = cnt;
                }

                cnt = 1;
                previous = current;
            }
        }

        if (cnt > max) {
            max = cnt;
        }
        return max;
    }
}
