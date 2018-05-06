package strings;

import java.util.HashMap;
import java.util.Map;

class IsomorphicStrings {

    boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            if (map.containsKey(sChar)) {
                if (!tChar.equals(map.get(sChar))) return false;
            } else {
                if (map.containsValue(tChar)) return false;
                map.put(sChar, tChar);
            }
        }
        return true;
    }
}
