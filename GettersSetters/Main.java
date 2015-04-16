public class Main {
  public static void main(String[] args) {
    Private p = new Private();

    System.out.println( p.getMyField() );
    p.setMyField("Blah !");
    System.out.println( p.getMyField() );

    Private q = new Private("Something");

    System.out.println( q.getMyField() );
    q.setMyField("Blah !");
    System.out.println( q.getMyField() );
  }
}
