package ru.irina.spring;

public class BlackMusic implements Music {

    @Override
    public String getSong() {
        return "Hvis Lys Tar Osset";
    }
    public void doInit(){
        System.out.println("Doing my initialization...");
    }
    public void doDestroy(){
        System.out.println("Doing my destruction...");
    }
}
