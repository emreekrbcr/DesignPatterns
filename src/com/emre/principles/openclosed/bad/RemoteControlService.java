package com.emre.principles.openclosed.bad;

public class RemoteControlService {

    public void on(Object obj){

        if (obj instanceof Tv){
            ((Tv) obj).on();
        }

        if (obj instanceof Radio){
            ((Radio) obj).on();
        }
    }

    public void off(Object obj){

        if (obj instanceof Tv){
            ((Tv) obj).off();
        }

        if (obj instanceof Radio){
            ((Radio) obj).off();
        }
    }
}
