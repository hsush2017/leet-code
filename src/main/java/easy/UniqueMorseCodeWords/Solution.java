package easy.UniqueMorseCodeWords;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private final static int ASCII_START_INDEX = 97;
    private final static String[] DICTIONARY = new String[]{
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.",
            "---", ".--.", "--.-", ".-.", "...", "-", "..-",
            "...-", ".--", "-..-", "-.--", "--.."
    };

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            StringBuilder sb = new StringBuilder();

            for (char c : chars) {
                sb.append(DICTIONARY[((int) c) - ASCII_START_INDEX]);
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}
