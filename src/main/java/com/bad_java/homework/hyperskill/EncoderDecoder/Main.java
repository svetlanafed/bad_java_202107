package com.bad_java.homework.hyperskill.EncoderDecoder;

public class Main {

    public static void main(String[] args) {
        Terminal terminal = new Terminal(System.in, System.out);
        ErrorsEmulator emulator = new ErrorsEmulator();
        Message message = new Message(terminal.readLine());
        terminal.println(message);
        terminal.println(message.repeatEveryLetterThreeTimes());
        String messageWithErrors = emulator.replaceChar(message);
        terminal.println(messageWithErrors);
        terminal.println(message.correctErrors(messageWithErrors));
    }
}
