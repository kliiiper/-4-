package Charecters;

public class Drigl extends Char{
    public Drigl(){
        super("Дригль");
    }

    @Override
    public void action() {

    }
    @Override
    public void setname(String name) {
        this.name = name;
    }
    @Override
    public String getname() {
        return this.name;
    }
    @Override
    public void stay(){
        System.out.println(this.name + " стоял в деревьях");
    }
    @Override
    public void hold(){
        Apparatus apparatus = new Apparatus();
        System.out.println(this.name + " держал в руках " + apparatus.getName());
        class Description{          //локальный класс
            private String description = " походил на радиоприемник";
            public String getDescription(){
                return this.description;
            }
            public String addDescription(){
                return this.description + " с громкоговорителем";
            }
        }
        Description description = new Description();
        System.out.println(apparatus.getName() + description.addDescription());
    }
    @Override
    public void scream(){
        Apparatus apparatus = new Apparatus();
        System.out.println(this.name + " выкрикивал слова в " + apparatus.getName());
    }
}
