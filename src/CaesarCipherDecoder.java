public class CaesarCipherDecoder implements CipherDecoder {
    private int shift;

    public CaesarCipherDecoder(int shift) {
        this.shift = shift;
    }

    @Override
    public String decode(String text) {
        StringBuilder decoded = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                decoded.append((char) ('A' + (c - 'A' - shift + 26) % 26));
            } else if (Character.isLowerCase(c)) {
                decoded.append((char) ('a' + (c - 'a' - shift + 26) % 26));
            } else {
                decoded.append(c);
            }
        }
        return decoded.toString();
    }
}
