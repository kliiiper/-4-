package Charecters;

public class Apparatus {
    private String name = "Аппарат";
    public String getName(){
        return this.name;
    }
    public class Speaker{           //вложенный нестатический класс
        private static String name = "Громкоговоритель";
        public String getName(){
            return this.name;
        }
        public static void increaseVoice(){
            System.out.println(name + " усиливал голос");
        }
    }
}
