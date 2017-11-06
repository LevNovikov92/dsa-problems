import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
 */
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

        boolean case1 = true;
        boolean case1_max = false;
        boolean case2 = true;
        boolean case2_one = false;
        for (Integer count : map.values()) {
            if (Objects.equals(max, count)) {
                if (case1_max) {
                    case1 = false;
                } else {
                    case1_max = true;
                }
            } else {
                if (max - count != 1) {
                    case1 = false;
                }
            }

            if (!max.equals(count) && count == 1) {
                if (case2_one) {
                    case2 = false;
                } else {
                    case2_one = true;
                }
            } else {
                if (!max.equals(count)) {
                    case2 = false;
                }
            }
        }

        if (case1 || case2) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
