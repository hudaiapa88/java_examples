package com.uc.encryption_example;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.Base64;

public class SimpleEncryption {
    public static void main(String[] args) throws Exception {
        // Anahtar ve IV (Initialization Vector) üretimi
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256); // AES için 256 bitlik anahtar kullanımı
        SecretKey key = keyGenerator.generateKey();

        byte[] iv = new byte[16]; // AES için 16 byte'lık IV
        SecureRandom random = new SecureRandom();
        random.nextBytes(iv);
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        // Şifreleyici nesnesinin oluşturulması
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key, ivSpec);

        // Şifrelenecek mesaj
        String originalMessage = "Gizli Mesaj";
        byte[] encryptedMessage = cipher.doFinal(originalMessage.getBytes());

        // Şifrelenmiş mesajın Base64 ile kodlanması ve URL'de güvenli taşımak için kodlama
        String encodedMessage = URLEncoder.encode(Base64.getEncoder().encodeToString(encryptedMessage), "UTF-8");
        String encodedIV = Base64.getEncoder().encodeToString(iv);
        String encodedKey = Base64.getEncoder().encodeToString(key.getEncoded());

        System.out.println("URL'de güvenli şifrelenmiş mesaj: " + encodedMessage);
        System.out.println("URL'de güvenli IV: " + encodedIV);
        System.out.println("URL'de güvenli anahtar: " + encodedKey);


        byte[] decodedKey = Base64.getDecoder().decode(encodedKey);
        byte[] decodedIV = Base64.getDecoder().decode(encodedIV);
        SecretKey originalKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");
        IvParameterSpec originalIvSpec = new IvParameterSpec(decodedIV);
        // Şifre çözme işlemi
        cipher.init(Cipher.DECRYPT_MODE, originalKey, originalIvSpec);
        byte[] decryptedMessageBytes = cipher.doFinal(Base64.getDecoder().decode(URLDecoder.decode(encodedMessage, "UTF-8")));
        String decryptedMessage = new String(decryptedMessageBytes);

        System.out.println("Çözülen Mesaj: " + decryptedMessage);
    }
}
