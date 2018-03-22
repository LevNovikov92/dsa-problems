class StringCompression {

    String compressString(String str) {
        final StringBuilder stringBuilder = new StringBuilder();
        final char[] chars = str.toCharArray();

        int symbolCount = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                stringBuilder.append(chars[i - 1]);
                stringBuilder.append(symbolCount);
                symbolCount = 1;
            } else {
                symbolCount++;
            }
        }

        stringBuilder.append(chars[chars.length - 1]);
        stringBuilder.append(symbolCount);

        if (stringBuilder.length() < str.length()) {
            return stringBuilder.toString();
        } else {
            return str;
        }
    }
}
