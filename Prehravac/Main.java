public class Main {
  public static void main(String[] args) {
    DVDPlayer player = new DVDPlayer();

    player.setPowerOn();
    player.play();
    player.next();
    player.getVolume();
    player.setVolume(50);
    player.getVolume();
    player.previous();
    player.pause();
    player.stop();
    player.setpowerOff();
  }
}
