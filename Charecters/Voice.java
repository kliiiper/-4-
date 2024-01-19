package Charecters;


import Errors.WrongVolumeOfVoiceException;

public class Voice {
    private String name = "Голос";
    private int value;
    public String getName(){
        return this.name;
    }
    public int getValue(){
        return this.value;
    }
    public Voice(int v){
        this.value = v;
    }
    public static class Options { //внутренний статический класс, вложенный
        public static void makeNoise(int value, String name) throws WrongVolumeOfVoiceException {
            if (value > 10) {
                throw new WrongVolumeOfVoiceException("Голос слишком громкий и оглушает всех персонажей");
            } else if (value <= 0) {
                throw new WrongVolumeOfVoiceException("Голос слишком тихий и его никто не слышит");
            } else {
                System.out.println(name + " невозможно было слушать без содрагания");
            }
        }
    }
}
