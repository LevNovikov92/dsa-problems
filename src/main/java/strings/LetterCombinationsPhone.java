package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LetterCombinationsPhone {

    private static final Map<Character, List<Character>> map = new HashMap<>();

    static {
        List<Character> list2 = new ArrayList<>();
        list2.add('a');
        list2.add('b');
        list2.add('c');
        map.put('2', list2);

        List<Character> list3 = new ArrayList<>();
        list3.add('d');
        list3.add('e');
        list3.add('f');
        map.put('3', list3);

        List<Character> list4 = new ArrayList<>();
        list4.add('g');
        list4.add('h');
        list4.add('i');
        map.put('4', list4);

        List<Character> list5 = new ArrayList<>();
        list5.add('j');
        list5.add('k');
        list5.add('l');
        map.put('5', list5);

        List<Character> list6 = new ArrayList<>();
        list6.add('m');
        list6.add('n');
        list6.add('o');
        map.put('6', list6);

        List<Character> list7 = new ArrayList<>();
        list7.add('p');
        list7.add('q');
        list7.add('r');
        list7.add('s');
        map.put('7', list7);

        List<Character> list8 = new ArrayList<>();
        list8.add('t');
        list8.add('u');
        list8.add('v');
        map.put('8', list8);

        List<Character> list9 = new ArrayList<>();
        list9.add('w');
        list9.add('x');
        list9.add('y');
        list9.add('z');
        map.put('9', list9);

    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        int[] indexes = new int[digits.length()];
        List<String> results = new ArrayList<>();
        while (indexes[0] < map.get(digits.charAt(0)).size()) {
            char[] chars = new char[digits.length()];
            for (int j = 0; j < digits.length(); j++) {
                chars[j] = map.get(digits.charAt(j)).get(indexes[j]);
            }
            results.add(new String(chars));

            for (int k = digits.length() - 1; k >= 0; k--) {
                if (indexes[k] == map.get(digits.charAt(k)).size() - 1) {
                    if (k == 0) return results;
                    indexes[k] = 0;
                } else {
                    indexes[k] = indexes[k] + 1;
                    break;
                }
            }
        }
        return results;
    }
}
