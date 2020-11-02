package SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<String>();
        if (nums.length == 0) {
            return answer;
        }

        if (nums.length == 1) {
            answer.add(String.valueOf(nums[0]));
            return answer;
        }

        int startValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                answer.add(createResult(startValue, nums[i - 1]));
                startValue = nums[i];
            }
        }

        answer.add(createResult(startValue, nums[nums.length - 1]));
        return answer;
    }

    private String createResult(int startValue, int endValue) {
        StringBuilder sb = new StringBuilder();
        if(startValue == endValue) {
            sb.append(startValue);
        } else {
            sb.append(startValue).append("->").append(endValue);
        }
        return sb.toString();
    }
}
