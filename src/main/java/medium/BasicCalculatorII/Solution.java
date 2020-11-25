package medium.BasicCalculatorII;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int calculate(String s) {
        s = s.replace(" ", "");

        String[] operands = s.split("\\+");
        int answer = subtract(operands[0]);
        for (int i = 1; i < operands.length; i++) {
            String str = operands[i];
            answer += subtract(str);
        }

        return answer;
    }

    private int subtract(String s) {
        String[] operands = s.split("-");
        int answer = multiplyAndDivide(operands[0]);
        for (int i = 1; i < operands.length; i++) {
            String str = operands[i];
            answer -= multiplyAndDivide(str);
        }

        return answer;
    }

    private int multiplyAndDivide(String s) {
        Queue<String> queue = new LinkedList<>();
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                queue.offer(sb.toString());
                queue.offer(String.valueOf(c));
                sb = new StringBuilder();
            }
        }
        queue.offer(sb.toString());

        int answer = queue.isEmpty() ? 0 : Integer.parseInt(queue.poll());
        while (!queue.isEmpty()) {
            String operator = queue.poll();
            int num = queue.isEmpty() ? 0 : Integer.parseInt(queue.poll());
            if (operator != null && operator.equals("*")) {
                answer *= num;
            } else {
                answer /= num;
            }

        }

        return answer;
    }
}
