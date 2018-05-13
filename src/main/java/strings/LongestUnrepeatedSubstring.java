package strings;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LongestUnrepeatedSubstring {

    String longestSubstring(String str) {
        if (str.isEmpty()) return "";
        String longestSubstring = str.substring(0, 1);

        LinkedList<Character> list = new LinkedList<>();
        Queue<Character> queue = list;
        queue.add(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (list.isEmpty() || !list.contains(str.charAt(i))) {
                queue.add(str.charAt(i));
                if (queue.size() > longestSubstring.length()) {
                    longestSubstring = getString(queue);
                }
            } else {
                queue.remove();
                i--;
            }
        }
        return longestSubstring;
    }

    String getString(Queue<Character> queue) {
        char[] arr = new char[queue.size()];
        Iterator<Character> iterator = queue.iterator();
        for (int i = 0; i < queue.size(); i++) {
            Character ch = iterator.next();
            arr[i] = ch;
        }
        return new String(arr);
    }
}
