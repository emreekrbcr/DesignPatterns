package com.emre;

import com.emre.principles.loosecoupling.good.CdPlayer;
import com.emre.principles.loosecoupling.good.RemoteControl;
import com.emre.principles.loosecoupling.good.RemoteControlService;
import com.emre.principles.loosecoupling.good.Tv;

public class Main {

    public static void main(String[] args) {

//        looseCouplingBad();
//        looseCouplingGood();
//        openClosedBad();
    }

    public static void looseCouplingBad(){
        com.emre.principles.loosecoupling.bad.
                RemoteControlService remoteControlService=new com.emre.principles.loosecoupling.bad.RemoteControlService();

        remoteControlService.tvOn();
        remoteControlService.tvOff();

        remoteControlService.radioOn();
        remoteControlService.radioOff();
    }

    public static void looseCouplingGood() {
        RemoteControl cdControl = new CdPlayer();
        RemoteControlService cdControlService = new RemoteControlService(cdControl);
        cdControlService.on();
        cdControlService.off();

        RemoteControl tvControl=new Tv();
        RemoteControlService tvControlService=new RemoteControlService(tvControl);
        tvControlService.on();
        tvControlService.off();
    }

    public static void openClosedBad(){
        com.emre.principles.openclosed.bad.
                RemoteControlService remoteControlService=new com.emre.principles.openclosed.bad.RemoteControlService();

        com.emre.principles.openclosed.bad.
                Tv tv=new com.emre.principles.openclosed.bad.Tv();

        remoteControlService.on(tv);
        remoteControlService.off(tv);

        com.emre.principles.openclosed.bad.
                Radio radio=new com.emre.principles.openclosed.bad.Radio();

        remoteControlService.on(radio);
        remoteControlService.off(radio);
    }
}
