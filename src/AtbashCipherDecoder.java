public class AtbashCipherDecoder implements CipherDecoder {
    @Override
    public String decode(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append((char) ('Z' - (c - 'A')));
            } else if (Character.isLowerCase(c)) {
                result.append((char) ('z' - (c - 'a')));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
