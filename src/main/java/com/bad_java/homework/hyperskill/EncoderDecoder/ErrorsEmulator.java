package com.bad_java.homework.hyperskill.EncoderDecoder;

import java.util.concurrent.ThreadLocalRandom;

public class ErrorsEmulator {

    String replaceChar(String message) {
        char[] inputArray = message.toCharArray();
        for (int i = 0; i < inputArray.length; i += 3) {
            int index = ThreadLocalRandom.current().nextInt(i, i + 3);
            char replacement;
            if (inputArray.length - i > 2) {
                do {
                    replacement = getRandomChar();
                } while (inputArray[index] == replacement);
                inputArray[index] = replacement;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : inputArray) {
            sb.append(c);
        }
        return sb.toString();
    }

    private char getRandomChar() {
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz 0123456789";
        return alphabet.charAt(ThreadLocalRandom.current().nextInt(alphabet.length()));
    }
}
