import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        char s[] = str.toCharArray();
        java.util.HashMap<Character, Integer> chars = new HashMap<Character, Integer>(128);
        for (char c : s) {
            if (chars.containsKey(c)){
                chars.replace(c, chars.get(c) + 1);
            } else {
                chars.put(c, 1);
            }
        }
        Map.Entry<Character, Integer> max = java.util.Collections.max(chars.entrySet(), Map.Entry.comparingByValue());
        return max.getKey();
    }
}
