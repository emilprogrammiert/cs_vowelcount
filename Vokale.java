import java.util.List;

public class Vokale {

    public static int getCount(String str) {
        return (int) str.chars().filter(it -> "aeiou".indexOf(it) >= 0).count();
    }

    public static int getCountAlt4(String str) {
        List<Integer> vocals = List.of((int) 'a', (int) 'e', (int) 'i', (int) 'o', (int) 'u');
        return (int) str.chars().filter(vocals::contains).count();
    }

    // Liefer die Anzahl von Vokalen in einer definierten Zeichenkette (String).
    // Vokale sind a, e, i, o, u.
    // Der Eingabetext (String) wird nur aus Kleinbuchstaben und/oder Leerzeichen bestehen.
    public static int getCountAlt3(String str) {
        List<Character> vocals = List.of('a', 'e', 'i', 'o', 'u');
        return (int) str.chars()
                .mapToObj(it -> (char) it)
                .filter(vocals::contains)
                .count();
    }

    public static int getCountAlt2(String str) {
        List<Character> vocals = List.of('a', 'e', 'i', 'o', 'u');
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (vocals.contains(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int getCountAlt(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
