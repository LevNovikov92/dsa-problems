import java.util.*;
import java.util.List;

public class TwoCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        System.out.print(calculate(s, len));
    }

    static int calculate(String str, int length) {
        final LinkedHashSet<Character> characterSet = new LinkedHashSet<>();
        for (Character c : str.toCharArray()) {
            characterSet.add(c);
        }

        int i = 0;
        int j = 0;
        int max = 0;
        final List<Character> chars = new ArrayList<>(characterSet);
        while (i < characterSet.size() - 1) {
            j += 1;
            for (int k = j; k < chars.size(); k++) {
                Character last = null;
                int count = 0;
                for (Character c : str.toCharArray()) {
                    if (c.equals(chars.get(i)) || c.equals(chars.get(k))) {
                        if (!c.equals(last)) {
                            count++;
                        } else {
                            count = -1;
                            break;
                        }
                        last = c;
                    }
                }
                if (count > 1 && count > max) {
                    max = count;
                }
            }
            i += 1;
        }
        return max;
    }
}
