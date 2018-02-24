package net.marcogallegos.messenger.exception;

public class CallNotFoundException extends RuntimeException{
    public CallNotFoundException(String message) {
        super(message);
    }
}
