class Cipher {
    String plainText;
    int key;

    Cipher(String plaintext, int key) {
        this.plainText = plaintext;
        this.key = key;
    }

    public String Encryption() {

        //convert String to char[]
        char[] pt = plainText.toCharArray();

        // Create new char[] of size Pt[]
        char[] ct = new char[pt.length];

        for (int i = 0; i < pt.length; i++) {
            // Convert Char to Int and key value
            int value = (int) pt[i] + key;

            // Convert int to char and add in ct[]
            ct[i] = (char) value;
        }
        // Convert char to String and return value
        return String.valueOf(ct);
    }

    public String Decryption(String enc) {
        char[] pt = enc.toCharArray();
        char[] ct = new char[pt.length];

        for (int i = 0; i < pt.length; i++) {
            int value = (int) pt[i] - key;
            ct[i] = (char) value;
        }
        return String.valueOf(ct);
    }
}

public class Main {
    public static void main(String[] args) {
        Cipher cipher = new Cipher("Encryption", 3);

        String enc = cipher.Encryption();
        System.out.println(enc);
        System.out.println(cipher.Decryption(enc));
    }
}

