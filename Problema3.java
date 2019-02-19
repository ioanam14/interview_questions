/**
 * Created by Ioana on 13-Feb-19.
 */
public class Problema3 {
    public static String encoder(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        Character lastChar = word.charAt(0);
        int length = 1;
        boolean isNumber = false;

        for (int i = 1; i < word.length(); i++) {
            if (lastChar.equals(word.charAt(i))) {
                length++;
            } else {
                isNumber = Character.isDigit(lastChar);

                if (length > 1 || isNumber) {
                    stringBuilder.append(length);
                    stringBuilder.append("x");
                }
                stringBuilder.append(lastChar);

                lastChar = word.charAt(i);
                length = 1;
            }
        }

        if (length > 1) {
            stringBuilder.append(length);
            stringBuilder.append("x");
        }
        stringBuilder.append(lastChar);

        return stringBuilder.toString();
    }
}
