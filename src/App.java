import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Classic Cipher Decoder ===");
        System.out.println("Available ciphers:");
        System.out.println("1. Caesar Cipher");
        System.out.println("2. Atbash Cipher");
        System.out.println("3. Vigenere Cipher");
        System.out.print("Choose a cipher (1-3): ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter the encoded text: ");
        String encoded = sc.nextLine();

        String decoded = "";

        switch (choice) {
            case 1:
                System.out.print("Enter the shift value: ");
                int shift = sc.nextInt();
                CaesarCipherDecoder caesar = new CaesarCipherDecoder(shift);
                decoded = caesar.decode(encoded);
                break;

            case 2:
                AtbashCipherDecoder atbash = new AtbashCipherDecoder();
                decoded = atbash.decode(encoded);
                break;

            case 3:
                System.out.print("Enter the key: ");
                String key = sc.nextLine();
                VigenereCipherDecoder vigenere = new VigenereCipherDecoder(key);
                decoded = vigenere.decode(encoded);
                break;

            default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }

        System.out.println("\nEncoded: " + encoded);
        System.out.println("Decoded: " + decoded);
        sc.close();
    }
}
