package Charecters;

import EnumAndInterfaces.Items;

public class Neznaika extends Char{
    public Neznaika(){
        super("Незнайка");
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
    public void wakeup(){
        System.out.println(this.name + " проснулся");
    }
    @Override
    public void talk(){
        System.out.println(this.name + " сказал");
    }
    @Override
    public void sledoval(){
        System.out.println(this.name + " последовал его примеру");
    }
    @Override
    public void ochutilsya(){ System.out.println(this.name + " очутился" + Items.pol);}
    @Override
    public void see(){
        System.out.println("Он увидел");
    }
    @Override
    public void openEyes(){
        System.out.println(this.name + " открыл глаза");
    }
}
