package EnumAndInterfaces;

import Charecters.Char;
import Errors.EmptyTargetOfVoiceException;

public interface Belong {
    public void belongTo(Char c) throws EmptyTargetOfVoiceException;
}
