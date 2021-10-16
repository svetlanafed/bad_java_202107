package com.bad_java.homework.hyperskill.EncoderDecoder;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Message {

    String message;

    String repeatEveryLetterThreeTimes() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            sb.append(message.substring(i, i + 1).repeat(3));
        }
        return sb.toString();
    }

    String correctErrors(String messageWithErrors) {
        StringBuilder correctLine = new StringBuilder();
        char[] wrongMessage = messageWithErrors.toCharArray();
        for (int i = 0; i < wrongMessage.length; i += 3) {
            if (wrongMessage.length - i > 2) {
                if (wrongMessage[i] == wrongMessage[i + 1] || wrongMessage[i] == wrongMessage[i
                    + 2]) {
                    correctLine.append(wrongMessage[i]);
                } else if (wrongMessage[i + 1] == wrongMessage[i + 2]) {
                    correctLine.append(wrongMessage[i + 1]);
                }
            } else {
                for (int j = i; j < wrongMessage.length; j++) {
                    correctLine.append(wrongMessage[j]);
                }
            }
        }
        return correctLine.toString();
    }
}
