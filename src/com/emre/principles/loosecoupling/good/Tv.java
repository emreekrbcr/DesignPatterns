package com.emre.principles.loosecoupling.good;

public class Tv implements RemoteControl{

    @Override
    public void on() {
        System.out.println("Tv turned on");
    }

    @Override
    public void off() {
        System.out.println("Tv turned off");
    }
}
