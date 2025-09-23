public class CaesarCipherDecoder {
    private int shift;

    public CaesarCipherDecoder(int shift) {
        this.shift = shift;
    }

    // Decode one character
    private char decodeChar(char c) {
        if (Character.isUpperCase(c)) {
            return (char) ((c - 'A' - shift + 26) % 26 + 'A');
        } else if (Character.isLowerCase(c)) {
            return (char) ((c - 'a' - shift + 26) % 26 + 'a');
        } else {
            return c; 
        }
    }

    // Decode full string into LinkedList
    public LinkedList decode(String message) {
        LinkedList list = new LinkedList();
        for (char c : message.toCharArray()) {
            list.add(decodeChar(c));
        }
        return list;
    }
}
