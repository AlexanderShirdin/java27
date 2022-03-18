package lesson18;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.security.SecureRandom;

public class DZ {
    public static void main(String[] args) throws Exception {
        SecureRandom random = SecureRandom.getInstanceStrong();
        byte[] rnd = new byte[16];
        random.nextBytes(rnd);
        IvParameterSpec ivSpec = new IvParameterSpec(rnd);
        // Prepare key
        KeyGenerator keygen = KeyGenerator.getInstance("AES");
        keygen.init(256);
        Key key = keygen.generateKey();
        // CBC
        String text = "Secret string";
        String transformation = "AES/CBC/PKCS5Padding";
        Cipher cipher = Cipher.getInstance(transformation);
        cipher.init(Cipher.ENCRYPT_MODE, key, ivSpec);
        byte[] enc = cipher.doFinal(text.getBytes());
        System.out.println(DatatypeConverter.printHexBinary(enc));
        // Decrypt
        cipher.init(Cipher.DECRYPT_MODE, key, ivSpec);
        String result = new String(cipher.doFinal(enc));
        System.out.println(result);
    }
}