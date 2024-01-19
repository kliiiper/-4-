package Charecters;

import java.security.PublicKey;
import java.util.Objects;

import EnumAndInterfaces.*;

public abstract class Char implements See, Talk, Undressed, Jump, Wakeup, Ostavil, Sledoval, Stay, Ochutilsya, OpenEyes, Hold, Scream {
    protected String name;
    public abstract void action();
    public abstract void setname(String name);
    public abstract String getname();
    public Char(String name){
        this.name = name;
    }
    @Override
    public void see(){}
    @Override
    public void talk(){}
    @Override
    public void undressed(){}
    @Override
    public void jump(){}
    @Override
    public void wakeup(){}
    @Override
    public void ostavil(){}
    @Override
    public void sledoval(){}
    @Override
    public void stay(){}
    @Override
    public void ochutilsya(){}
    @Override
    public void openEyes(){}
    @Override
    public void hold(){}
    @Override
    public void scream(){}
    @Override
        public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Char entity = (Char) o;
            return name == entity.name;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(name);
        }
}
