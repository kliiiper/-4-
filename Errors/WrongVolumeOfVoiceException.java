package Errors;

public class WrongVolumeOfVoiceException extends RuntimeException{
    private int volume;
    public WrongVolumeOfVoiceException(String message, Throwable cause, int volume){
        super(message, cause);
        this.volume = volume;
    }
    public WrongVolumeOfVoiceException(String message){
        super(message);
    }
}

