import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAndValidString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }

    static String isValid(String s){
        final Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }

        Integer max = 0;
        for (Integer count : map.values()) {
            if (count > max) {
                max = count;
            }
        }

        boolean used = false;
        for (Integer count : map.values()) {
            if (max - count == 1) {
                if (used) {
                    return "No";
                }
                used = true;
            }

        }
    }
}
