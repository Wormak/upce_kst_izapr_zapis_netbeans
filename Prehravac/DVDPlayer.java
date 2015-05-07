public class DVDPlayer {
  private StateOfPlayer state;
  private Display display;
  private int volume;

  public DVDPlayer() {
    display = new Display();
    volume = 0;
    state = StateOfPlayer.POWEROFF;
  }

  public void getVolume() {
    display.printMessage(volume + "%");
  }

  public void setVolume(int volume) {
    if ((volume >= 0) && (volume <= 100)) {
      this.volume = volume;
    }
  }

  public String getStrState() {
    String retVal = "";
    switch (state) {
      case PLAY:
        retVal = "Play";
        break;
      case STOP:
        retVal = "Stop";
        break;
      case PAUSE:
        retVal = "Pause";
        break;
      case POWEROFF:
        retVal = "Power off";
        break;
      default: retVal = "UNKNOW";
    }
    return retVal;
  }

  public void setPowerOn() {
    if (state == StateOfPlayer.POWEROFF) {
      state = StateOfPlayer.STOP;
    } else {
      state = StateOfPlayer.POWEROFF;
    }
    display.printState(this.getStrState());
  }

  public void setpowerOff() {
    state = StateOfPlayer.POWEROFF;
    display.printState(this.getStrState());
  }

  public void play() {
    if (state != StateOfPlayer.POWEROFF) {
      state = StateOfPlayer.PLAY;
    }
    display.printState(this.getStrState());
  }

  public void stop() {
    if (state != StateOfPlayer.POWEROFF) {
      state = StateOfPlayer.STOP;
    }
    display.printState(this.getStrState());
  }

  public void pause() {
    if (state != StateOfPlayer.POWEROFF) {
      state = StateOfPlayer.PAUSE;
    }
    display.printState(this.getStrState());
  }

  public void previous() {
    if (state != StateOfPlayer.POWEROFF) {
      state = StateOfPlayer.PLAY;
      display.printMessage("Jump to the previous track :)");
      display.printState(this.getStrState());
    }
  }

  public void next() {
    if (state != StateOfPlayer.POWEROFF) {
      state = StateOfPlayer.PLAY;
      display.printMessage("Jump to the next track :)");
      display.printState(this.getStrState());
    }
  }

}
