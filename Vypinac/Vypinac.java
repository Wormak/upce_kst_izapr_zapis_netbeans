public class Vypinac {

  boolean poloha;

  public void zapni() {
    poloha = true;
  }

  public void vypni() {
    poloha = false;
  }

  public void prepni() {
    //poloha = (poloha) ? true : false;
    poloha = !poloha;
  }

  public void vypisStav() {
    if (poloha) {
      System.out.println("ZAPNUTO.");
    } else {
      System.out.println("VYPNUTO.");
    }
  }

}
