
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WeightedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        final HashMap<Character, Integer> sums = getSums(s);
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            if (contains(sums, x)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    static boolean contains(HashMap<Character, Integer> sums, int x) {
        for (Map.Entry<Character, Integer> entry : sums.entrySet()) {
            final int key = entry.getKey() - 96;
            final int val = entry.getValue();
            if (x % key == 0 && x <= val) {
                return true;
            }
        }
        return false;
    }

    static HashMap<Character, Integer> getSums(String s) {
        final HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (map.get(c) == null) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + c - 96);
        }
        return map;
    }
}
