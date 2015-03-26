import java.util.Scanner;

public class Secti_interval {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Min: ");
    int min = sc.nextInt();
    System.out.print("Max: ");
    int max = sc.nextInt();

    double x = 0;
    for ( int i = min; i <= max; i++ ) {
      x += i;
      System.out.print(i+"+");
    }
    System.out.println("\b = "+x);

    double y = 0;
    for ( int i = min; i <= max; i++ ) {
      if ( i % 3 == 0 ) {
        y += i;
        System.out.print(i+"+");
      }
    }
    System.out.println("\b = "+y);
  }
}
