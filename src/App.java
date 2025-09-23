import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the encoded text: ");
        String encoded = sc.nextLine();

        System.out.print("Enter the shift value: ");
        int shift = sc.nextInt();

        CaesarCipherDecoder decoder = new CaesarCipherDecoder(shift);
        LinkedList decodedMessage = decoder.decode(encoded);


        System.out.println("\nEncoded: " + encoded);
        System.out.println("Decoded: " + decodedMessage.toString());
        
        sc.close();
    }
}
