public class IsPalindrome {

    boolean isPalindrome(int x) {
        final char[] str = String.valueOf(x).toCharArray();
        if (str.length == 0) return false;
        if (str.length == 1) return true;

        final int charsCount = str.length / 2;
        for (int i = 0; i < charsCount; i++) {
            if (str[i] != str[str.length - i - 1]) return false;
        }
        return true;
    }
}
