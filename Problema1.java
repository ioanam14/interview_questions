import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ioana on 13-Feb-19.
 */
public class Problema1 {
    public static boolean isAnagram(String word1, String word2) {
        Map<Character, Integer> countLetters = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            Character character = word1.charAt(i);
            Integer count;

            if (countLetters.containsKey(character)) {
                count = countLetters.get(character) + 1;
            } else {
                count = 1;
            }
            countLetters.put(character, count);
        }

        for (int i = 0; i < word2.length(); i++) {
            Character character = word2.charAt(i);
            Integer count;

            if (countLetters.containsKey(character)) {
                count = countLetters.get(character);

                if (count == 0) {
                    return false;
                } else {
                    count--;
                }
            } else {
                return false;
            }
            countLetters.put(character, count);
        }

        for (Integer value : countLetters.values()) {
            if (value > 0) {
                return false;
            }
        }

        return true;
    }
}
