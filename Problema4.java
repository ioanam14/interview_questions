import java.util.Random;

/**
 * Created by Ioana on 16-Feb-19.
 */
public class Problema4 {
    public static String generatePass(int length, String[] alphabet) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        if (length < alphabet.length) {
            return null;
        }

        for (int i = 0; i < alphabet.length; i++) {
            int x = random.nextInt(alphabet[i].length());
            char character = alphabet[i].charAt(x);
            password.append(character);
        }

        for (int i = 0; i < length - alphabet.length; i++) {
            int position = random.nextInt(alphabet.length);
            int x = random.nextInt(alphabet[position].length());
            char character = alphabet[position].charAt(x);
            password.append(character);
        }
        return password.toString();
    }
}
