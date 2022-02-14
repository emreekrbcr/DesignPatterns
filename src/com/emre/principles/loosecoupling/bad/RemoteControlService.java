package com.emre.principles.loosecoupling.bad;

public class RemoteControlService {

    private Tv tv=new Tv();
    private Radio radio=new Radio();

    public void tvOn(){
        tv.on();
    }

    public void tvOff(){
        tv.off();
    }

    public void radioOn(){
        radio.on();
    }

    public void radioOff(){
        radio.off();
    }
}
