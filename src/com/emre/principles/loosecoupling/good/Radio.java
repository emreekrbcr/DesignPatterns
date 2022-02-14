package com.emre.principles.loosecoupling.good;

public class Radio implements RemoteControl{

    @Override
    public void on() {
        System.out.println("Radio turned on");
    }

    @Override
    public void off() {
        System.out.println("Radio turned off");
    }
}
