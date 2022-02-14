package com.emre.principles.loosecoupling.good;

public class CdPlayer implements RemoteControl{

    @Override
    public void on() {
        System.out.println("Cd player turned on");
    }

    @Override
    public void off() {
        System.out.println("Cd player turned off");
    }
}
