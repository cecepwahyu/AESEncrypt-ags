public class Main {
    public static void main(String[] args) {
        try {
            AES aes = new AES();
            aes.init();
            String encryptedMessage = aes.encrypt("Hallo Test aja!");
            String decryptedMessage = aes.decrypt(encryptedMessage);

            System.out.println("AES Encryption Decryption Example");
            System.out.println("Encrypted Message: " + encryptedMessage);
            System.out.println("Decrypted Message: " + decryptedMessage);

            AESSPA aesspa = new AESSPA();
            String encryptedMessage2 = aesspa.encrypt("Hallo Test aja!");
            String decryptedMessage2 = aesspa.decrypt(encryptedMessage2);

            System.out.println("AESSPA Encryption Decryption Example");
            System.out.println("Encrypted Message: " + encryptedMessage2);
            System.out.println("Decrypted Message: " + decryptedMessage2);
        } catch (Exception ignored){}
    }
}
