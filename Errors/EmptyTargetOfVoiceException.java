package Errors;

import java.io.IOException;

public class EmptyTargetOfVoiceException extends IOException {
    private String name;
    public EmptyTargetOfVoiceException(String message, Throwable cause, String name){
        super(message, cause);
        this.name = name;
    }
    public EmptyTargetOfVoiceException(String message){
        super(message);
    }
}
