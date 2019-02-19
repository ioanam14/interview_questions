import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ioana on 12-Feb-19.
 */
public class Main {
    public static void main (String[] args) {
        //Problema1
        System.out.println("Problema 1");
        System.out.println(Problema1.isAnagram("abaab", "abbaa"));
        System.out.println(Problema1.isAnagram("abaab", "abbac"));
        System.out.println();

        //Problema2
        System.out.println("Problema 2");
        Problema2 coada = new Problema2();
        coada.add(4);
        coada.add(3);
        coada.add(7);
        coada.add(5);
        coada.add(1);
        System.out.println("Size " + coada.size());
        System.out.println("Peek " + coada.peek());
        coada.remove();
        System.out.println("Peek " + coada.peek());
        System.out.println();

        //Problema3
        System.out.println("Probllema 3");
        System.out.println(Problema3.encoder("aaabccccc"));
        System.out.println(Problema3.encoder("aaab8ccccc"));
        System.out.println();

        //Problema4
        System.out.println("Problema 4");
        String[] alphabet = {"abcdefghijklmn", "ABCDEFTGH", "1234567890", "_."};
        System.out.println(Problema4.generatePass(5, alphabet));
    }
}
