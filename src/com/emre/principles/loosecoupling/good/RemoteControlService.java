package com.emre.principles.loosecoupling.good;

public class RemoteControlService {

    private RemoteControl remoteControl;

    public RemoteControlService(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
    }

    public void on(){
        remoteControl.on();
    }

    public void off(){
        remoteControl.off();
    }
}
