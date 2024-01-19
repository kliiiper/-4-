package Charecters;

import EnumAndInterfaces.Items;

public class Miga extends Char {
    public Miga(){
    super("Мига");
    }
    @Override
    public void action(){
    }
    @Override
    public void setname(String name){
        this.name = name;
    }
    @Override
    public String getname(){
        return this.name;
    }
    @Override
    public void see(){
        System.out.println(this.name + " увидел");
    }
    @Override
    public void talk(){
        System.out.println(this.name +" не сказав болше ни слова");
    }
    @Override
    public void undressed(){
        System.out.println(this.name +" разделся");
    }
    @Override
    public void jump(){
        System.out.println(this.name +" спрыгнул" + Items.niz);
    }
    @Override
    public void ostavil(){
        System.out.println(this.name +" оставил" + Items.odezhda);
    }
}
