package Charecters;

import EnumAndInterfaces.Items;

public class Korotishki extends Char {
    public Korotishki(){
        super("Коротышки");
    }
    @Override
    public void action(){}
    @Override
    public void setname(String name){
        this.name = name;
    }
    @Override
    public String getname(){
        return this.name;
    }
    @Override
    public void stay(){
        System.out.println(this.name + " стояли" + Items.polki);
    }
    
}
