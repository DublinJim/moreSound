package com.company;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;

public class Main {

  public static void main(String[] args) {

    System.out.println("Begin");

    soundSystemInfo();
  }

  private static void soundSystemInfo() {
    Mixer.Info[] pcSoundInfo = AudioSystem.getMixerInfo();
    System.out.println(pcSoundInfo[0].getName());



    if (pcSoundInfo[0].getName().equals("Port Headset Earphone (Microsoft Lif")) {
      System.out.println("------------------headset-----------------");
      //
    }
  }
}
