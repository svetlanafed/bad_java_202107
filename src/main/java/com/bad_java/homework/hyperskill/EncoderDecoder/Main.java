package com.bad_java.homework.hyperskill.EncoderDecoder;

public class Main {

    public static void main(String[] args) {
        Terminal terminal = new Terminal(System.in, System.out);
        ErrorsEmulator emulator = new ErrorsEmulator();
        Message message = new Message(terminal.readLine());

        terminal.println(message.getMessage());
        String tripledMessage = message.repeatEveryLetterThreeTimes();
        terminal.println(tripledMessage);
        String messageWithErrors = emulator.replaceChar(tripledMessage);
        terminal.println(messageWithErrors);
        terminal.println(message.correctErrors(messageWithErrors));
    }
}
