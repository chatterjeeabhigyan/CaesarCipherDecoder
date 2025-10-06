public class VigenereCipherDecoder implements CipherDecoder {
    private String key;

    public VigenereCipherDecoder(String key) {
        this.key = key.toUpperCase();
    }

    @Override
    public String decode(String text) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();
        int keyIndex = 0;

        for (char c : text.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                int shift = key.charAt(keyIndex) - 'A';
                char decodedChar = (char) ((c - 'A' - shift + 26) % 26 + 'A');
                result.append(decodedChar);
                keyIndex = (keyIndex + 1) % key.length();
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
