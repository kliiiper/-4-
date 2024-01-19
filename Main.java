import Charecters.*;
import EnumAndInterfaces.Belong;
import Errors.EmptyTargetOfVoiceException;
import Errors.WrongVolumeOfVoiceException;

public class Main {
    public static void main(String[] args){
        Char korotishki = new Korotishki();
        Char miga = new Miga();
        Char neznaika = new Neznaika();
        Char drigl = new Drigl();

        Voice voice = new Voice(4);


        Belong belong = new Belong() {          //анонимный класс
            String name = voice.getName();
            @Override
            public void belongTo(Char c) throws EmptyTargetOfVoiceException {
                if (c.getname().isEmpty()){
                    throw new EmptyTargetOfVoiceException("Голос должен принадлежать кому-то");
                }
                System.out.println(name + " принадлежал " + c.getname());
            }
        };

        neznaika.openEyes();
        neznaika.see();
        try{
            belong.belongTo(drigl);
        }catch (EmptyTargetOfVoiceException e){
            System.err.println(e.getMessage());
            System.exit(0);
        }
        drigl.stay();
        drigl.hold();
        drigl.scream();
        Apparatus.Speaker.increaseVoice();
        try{
            Voice.Options.makeNoise(voice.getValue(), voice.getName());
        }catch (WrongVolumeOfVoiceException e){
            System.err.println(e.getMessage());
        }
        miga.see();
        neznaika.wakeup();
        neznaika.talk();
        miga.talk();
        miga.undressed();
        miga.ostavil();
        miga.jump();
        neznaika.sledoval();
        neznaika.ochutilsya();
        neznaika.see();
        korotishki.stay();

    }

    
}
