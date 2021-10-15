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
    String correctErrors(String messageWithErrors){
        //дописать
        return null;
    }
}
